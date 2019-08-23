package ch.noseryoung.plj.demo.city;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * City Class 
 * @author Elijana
 *
 */
@Entity
@Table(name = "city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name="population")
	private int population;
	
	
	
	public City() {
	}
	
	

	public City(long id, String name, int population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
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

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}



	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population=" + population + "]";
	}
	
	
	

}
