package com.tnsif.samplespring;

public class Customer {
	private int id;
	private String name;
	private String city;
	 //create reference for the interface..
	private Shopping s1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Shopping getS1() {
		return s1;
	}
	public void setS1(Shopping s1) {
		this.s1 = s1;
	}
	

}
