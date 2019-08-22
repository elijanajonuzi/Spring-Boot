package ch.noseryoung.plj.demo.city;

class City {
	private long id;
	private String name;
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
