package ch.noseryoung.plj.demo.city;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class CityController {

	private CityService cityService;
	
	@Autowired
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}

	@PostMapping("/addCity")
	public @ResponseBody ResponseEntity<String> addCity(@RequestBody City city){
		Region region = new Region();
		region.addRandomCity();
		region.addCity(city.getId(),city.getName(),city.getPopulation());
		return new ResponseEntity<String>(city.getName(),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<City> getCity(@PathVariable long id ){
		Region region = new Region();
		region.addRandomCity();
		return new ResponseEntity<City>(new City(id,"bern",5000),HttpStatus.OK);
	}
	@GetMapping("/listCity")
	public @ResponseBody ResponseEntity<ArrayList<City>> getAllCities(){
		Region region = new Region();
		region.addRandomCity();
		return new ResponseEntity<ArrayList<City>>(region.cities,HttpStatus.OK);
	}
	@PutMapping("/{idOld}")
	public @ResponseBody ResponseEntity<String> updateCity(@RequestBody City city, @PathVariable long idOld){
		Region region = new Region();
		region.addRandomCity();
		if(region.updateCity(idOld, city.getName(),city.getPopulation())) {
			return new ResponseEntity<String> ("OK",HttpStatus.OK);	
	}
		return new ResponseEntity<String> ("Not existing", HttpStatus.BAD_REQUEST);
		
	}
	
	/*@DeleteMapping("/delete")
	public @ResponseBody ResponseEntity<> */
	
	
	
	
	
	
	


	
}
