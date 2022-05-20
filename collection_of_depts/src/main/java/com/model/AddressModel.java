package com.model;

public class AddressModel {
	private String streetName;
	private String CityName;
	
	
	//Getters and Setters
	public String getStreetName() {
		return streetName;
	}
	public String getCityName() {
		return CityName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public AddressModel(String streetName, String cityName) {
		super();
		this.streetName = streetName;
		CityName = cityName;
	}
	

}
