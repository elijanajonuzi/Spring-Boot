package ch.noseryoung.plj.demo.city;

import org.springframework.stereotype.Service;

@Service 
public class CityService {

	private int rndInt;

	public CityService() {
		
	}
	
	public CityService(int rndInt) {
		super();
		this.rndInt = rndInt;
	}
	
	public int multiplyNumberBy2(int number) {
		return number*2;
	}

	public int getRndInt() {
		return rndInt;
	}

	public void setRndInt(int rndInt) {
		this.rndInt = rndInt;
	}
	
}
