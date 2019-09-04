package ch.noseryoung.plj.demo.city;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy ="region")
	private List<City> region; 
	

public Region() {
	
}



public Region(long id, String name) {
	super();
	this.id = id;
	this.name = name;
}



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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




















}



