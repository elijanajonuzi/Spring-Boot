package ch.noseryoung.plj.demo.city;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web Layer 
 * 
 * @author Elijana
 *
 */
@RestController
@RequestMapping("/city")
public class RegionController {
	
	
	

	private RegionService regionService;
	
	@Autowired
	public RegionController(RegionService regionService) {
		this.regionService = regionService;
	}
	/**
	 * 
	 * @param city is the city that u want to add
	 * @return ResponseEntity with the name of the city that was added
	 */
	@PostMapping("/addCity")
	public @ResponseBody ResponseEntity<String> addCity(@RequestBody City city){
		regionService.addCity(city);
		return new ResponseEntity<String>(city.getName(),HttpStatus.CREATED);
	}
	
	/**
	 * 
	 * @param id 
	 * @return ResponseEntity gives the city that was requested
	 */
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Optional<City>> getCity(@PathVariable long id ){
		Optional<City> city=regionService.getCityFromDB(id);
		return new ResponseEntity<Optional<City>>(city,HttpStatus.OK);
	}
	/**
	 * 
	 * @return ResponseEntity with all cities 
	 */
	@GetMapping("/listCity")
	public @ResponseBody ResponseEntity<List<City>> getAllCities(){
			return new ResponseEntity<List<City>>(regionService.getAllCities(),HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param id
	 * @return ResponseEntity with Population of requested city
	 */
	@GetMapping("/{id}/population")
	public @ResponseBody ResponseEntity<Integer> getCityPopulation(@PathVariable long id){
		Optional<City> city=regionService.getCityPopulationById(id);
		return new ResponseEntity<Integer>(city.get().getPopulation(),HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param id
	 * @return ResponseEntity with Name of requested city
	 */
	@GetMapping("/{id}/name")
	public @ResponseBody ResponseEntity<String> getCityName(@PathVariable long id){
		Optional<City> city=regionService.getCityNameById(id);
		return new ResponseEntity<String>(city.get().getName(),HttpStatus.OK);
	}
	/**
	 * 
	 * @param population 
	 * @return ResponseEntity with all cities that have same population or more
	 */
	
	@GetMapping("/where/{population}")
	public @ResponseBody ResponseEntity<List<City>> getCitiesByPopulation(@PathVariable int population){
		return new ResponseEntity<List<City>>(regionService.gettAllCitiesByPopulation(population),HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param city is what i need to change
	 * @param idToChange 
	 * @return ResponseEntity with OK
	 */
	
	@PutMapping("/update/{idToChange}")
	public @ResponseBody ResponseEntity<String> updateCity(@RequestBody City city, @PathVariable long idToChange){
		regionService.updateCity(idToChange, city);
			return new ResponseEntity<String> ("OK",HttpStatus.OK);	
	}
	
	/**
	 * 
	 * @param idCity Id that want to be deleted
	 * @return 
	 */
	
	@DeleteMapping("/delete/{idCity}")
	public @ResponseBody ResponseEntity<String> deleteCity(@PathVariable long idCity){
		regionService.deleteCity(idCity);
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/listCity/{idToList}")
	public @ResponseBody ResponseEntity<List<City>> getAllCitiesInRegion(@PathVariable long idToList){
			return new ResponseEntity<List<City>>(regionService.getAllCitiesInRegion(idToList),HttpStatus.OK);
	}
	
	@GetMapping("/listbyRegion/{idRegion}")
		public @ResponseBody ResponseEntity<List<City>> getAllCitiesInRegionID(@PathVariable long idRegion){
			return new ResponseEntity<List<City>>(regionService.getAllCitiesInRegionID(idRegion),HttpStatus.OK);
	}
	@GetMapping("/listAll")
	public @ResponseBody ResponseEntity<List<City>> listAllCities(){
		return new ResponseEntity<List<City>>(regionService.getAllCitiesWithRegion(),HttpStatus.OK);
		
}
	
	
	
	
	
	
	
	


	
}
