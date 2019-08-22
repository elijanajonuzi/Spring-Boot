package ch.noseryoung.plj.demo.city;

import java.util.ArrayList;

public class Region {
ArrayList<City> cities=new ArrayList<City>();

public Region() {
	
}

public Region(ArrayList<City> cities) {
	super();
	this.cities = cities;
}


/*protected void addCity(long id, String name, int population) {
	cities.add(new City(id,name,population));
}

protected boolean deleteCity(long id) {
	for (int index=0; index<cities.size();index++) {
		if(cities.get(index).getId()==id) {
			cities.remove(index);
			return true;
		}
	
	}
	return false;
	
	
}

protected boolean updateCity(long idToChange,  String name,int population) {
	for (int index=0; index<cities.size();index++) {
		if(cities.get(index).getId()==idToChange) {
			cities.get(index).setPopulation(population);
			return true;
		}
	}
	return false;
	
}

protected void addRandomCity() {
	//cities.add(new City(100,"Bern",2000));
	cities.add(new City(77,"Rome", 60));
	cities.add(new City(88,"Ehi", 890));
}
protected String printCities() {
	for (City city : cities) {
		return city.toString();
	}
	return "Hello";
} 
*/




public ArrayList<City> getCities() {
	return cities;
}

public void setCities(ArrayList<City> cities) {
	this.cities = cities;
}

@Override
public String toString() {
	for (City city : cities) {
		city.toString();
	}
	return "Region [cities=" + cities + "]";
}











}



