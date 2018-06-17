package com.model;

import java.math.BigInteger;

public class Player {

	private String firstName;
	private String lastName;
	private Country country;
	private int age;
	private BigInteger marketValue;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigInteger getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigInteger marketValue) {
		this.marketValue = marketValue;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", marketValue="
				+ marketValue + "]";
	}

}
