package ch.noseryoung.plj.demo.city;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event.ID;


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
		region.cities.add(new City(city.getId(),city.getName(),city.getPopulation()));
	}
	
	protected boolean deleteCity(long id) {
		addRandomCity();
		for (int index=0; index<region.cities.size();index++) {
			if(region.cities.get(index).getId()==id) {
				region.cities.remove(index);
				return true;
			}
		
		}
		return false;
		
		
	}
	
	protected Optional<City> getCityFromDB(long id){
		return cityrepository.findById(id);
	}
	
	protected 
	
	

protected boolean updateCity(long idToChange,City city) {
	addRandomCity();
	for (int index=0; index<region.cities.size();index++) {
		if(region.cities.get(index).getId()==idToChange) {
			region.cities.get(index).setId(city.getId());
			region.cities.get(index).setName(city.getName());
			region.cities.get(index).setPopulation(city.getPopulation());
			return true;
		}
	}
	return false;
	
}

protected String printCities() {
	for (City city : region.cities) {
		return city.toString();
	}
	return "Hello";
}

protected void addRandomCity() {
	region.cities.add(new City(100,"Bern",2000));
	region.cities.add(new City(77,"Rome", 60));
	region.cities.add(new City(88,"Ehi", 890));
	
}

	

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	

	
	
	
	
}
