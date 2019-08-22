package ch.noseryoung.plj.demo.city;

import java.awt.List;
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
	public @ResponseBody ResponseEntity<ArrayList<City>> getAllCities(){
		regionService
		return new ResponseEntity<ArrayList<City>>(regionService.getRegion().cities,HttpStatus.OK);
	}
	@PutMapping("/update/{idToChange}")
	public @ResponseBody ResponseEntity<String> updateCity(@RequestBody City city, @PathVariable long idToChange){
		if(regionService.updateCity(idToChange, city)) {
			return new ResponseEntity<String> ("OK",HttpStatus.OK);	
	}
		return new ResponseEntity<String> ("Not existing", HttpStatus.BAD_REQUEST);
		
	}
	
	@DeleteMapping("/delete/{idCity}")
	public @ResponseBody ResponseEntity<String> deleteCity(@PathVariable long idCity){
		if(regionService.deleteCity(idCity)) {
			return new ResponseEntity<String>("OK",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Not Existing",HttpStatus.OK);
	}
	
	
	
	
	
	
	


	
}
