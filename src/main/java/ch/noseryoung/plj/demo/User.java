package ch.noseryoung.plj.demo;

import java.util.ArrayList;

public class User {

	private String vorname;
	private String nachname;
	private long id;
	private ArrayList<String> collection;
	
	public User(String vorname, String nachname, long id, ArrayList<String> collection) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.id = id;
		this.collection = collection; 
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<String> getCollection() {
		return collection;
	}

	public void setCollection(ArrayList<String> collection) {
		this.collection = collection;
	} 
	
}
