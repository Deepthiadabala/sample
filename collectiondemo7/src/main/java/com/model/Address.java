package com.model;

public class Address {
	private int doorNum;
	private String street;
	private String city;

	public int getDoorNum() {
		return doorNum;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(int doorNum, String street, String city) {
		super();
		this.doorNum = doorNum;
		this.street = street;
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
