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

@RestController
@RequestMapping("/city")
public class RegionController {

	private RegionService regionService;
	
	@Autowired
	public RegionController(RegionService regionService) {
		this.regionService = regionService;
	}

	@PostMapping("/addCity")
	public @ResponseBody ResponseEntity<String> addCity(@RequestBody City city){
		regionService.addCity(city);
		return new ResponseEntity<String>(city.getName(),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Optional<City>> getCity(@PathVariable long id ){
		Optional<City> city=regionService.getCityFromDB(id);
		return new ResponseEntity<Optional<City>>(city,HttpStatus.OK);
	}
	@GetMapping("/listCity")
	public @ResponseBody ResponseEntity<List<City>> getAllCities(){
			return new ResponseEntity<List<City>>(regionService.getAllCities(),HttpStatus.OK);
	}
	@GetMapping("/{id}/population")
	public @ResponseBody ResponseEntity<Integer> getCityPopulation(@PathVariable long id){
		Optional<City> city=regionService.getCityPopulationById(id);
		return new ResponseEntity<Integer>(city.get().getPopulation(),HttpStatus.OK);
	}
	@GetMapping("/{id}/name")
	public @ResponseBody ResponseEntity<String> getCityName(@PathVariable long id){
		Optional<City> city=regionService.getCityNameById(id);
		return new ResponseEntity<String>(city.get().getName(),HttpStatus.OK);
	}
	@GetMapping("/where/{population}")
	public @ResponseBody ResponseEntity<List<City>> getCitiesByPopulation(@PathVariable int population){
		return new ResponseEntity<List<City>>(regionService.gettAllCitiesByPopulation(population),HttpStatus.OK);
	}
	
	@PutMapping("/update/{idToChange}")
	public @ResponseBody ResponseEntity<String> updateCity(@RequestBody City city, @PathVariable long idToChange){
		regionService.updateCity(idToChange, city);
			return new ResponseEntity<String> ("OK",HttpStatus.OK);	
	}
	
	@DeleteMapping("/delete/{idCity}")
	public @ResponseBody ResponseEntity<String> deleteCity(@PathVariable long idCity){
		regionService.deleteCity(idCity);
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	
	
	
	
	
	
	


	
}
