package ch.noseryoung.plj.demo.city;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.noseryoung.plj.demo.city.dto.CityDTO;
/**
 * 
 * Service Layer
 * 
 * @author Elijana
 *
 */

@Service 
public class RegionService {

	private Region region=new Region();
	
	private CityRepository cityrepository;
	
	@Autowired
	public RegionService(CityRepository cityrepository) {
		this.cityrepository=cityrepository;
		
	}
	
	
	
	public RegionService() {
		//addRandomCity();
	}

	public RegionService(Region region) {
		super();
		this.region = region;
		
	}
	
	protected void addCity(City city) {
	long id= city.getId();
	String name= city.getName();
	int population= city.getPopulation();
	City newCity=new City(id,name,population);
	cityrepository.save(newCity);
	}
	
	protected void deleteCity(long id) {
		cityrepository.deleteById(id);
	}
	
	protected Optional<City> getCityFromDB(long id){
		return cityrepository.findById(id);
	}
	
	protected Optional<City> getCityPopulationById(long id) {
		return cityrepository.findById(id);
	}
	protected Optional<City> getCityNameById(long id) {
		return cityrepository.findById(id);
	}
	protected List<City> getAllCities(){
		return cityrepository.findAll();
	}
	protected List<City> getAllCitiesInRegion(long id){
		return cityrepository.selectCityWithRegion(id);
	}
	protected List<City> getAllCitiesInRegionID(long id){
		return cityrepository.selectCityWithRegionID(id);
	}
	
	protected List<City> gettAllCitiesByPopulation(int population){
		return (List<City>) cityrepository.selectCityWithPopulation(population);
	}
	protected List<City> getAllCitiesWithRegion(){
		return (List<City>) cityrepository.findAll();
	}
	
	

protected void updateCity(long idToChange,City city) {
	cityrepository.save(new City(idToChange,city.getName(),city.getPopulation()));
}



/*protected void addRandomCity() {
	region.cities.add(new City(100,"Bern",2000));
	region.cities.add(new City(77,"Rome", 60));
	region.cities.add(new City(88,"Ehi", 890));
	
}*/

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
}
