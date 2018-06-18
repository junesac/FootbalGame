package com.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.model.Country;
import com.model.PlayerType;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;
	private String lastName;

	@Enumerated(EnumType.STRING)
	private Country country;

	private int age;
	private BigInteger marketValue;
	private boolean presentOnTransferList;

	@Enumerated(EnumType.STRING)
	private PlayerType playerType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "team_id", nullable = false)
	private Team team;

	public Player() {

	}

	public Player(String firstName, String lastName, Country country, int age, PlayerType playerType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.age = age;
		marketValue = new BigInteger("1000");
		presentOnTransferList = false;
		this.playerType = playerType;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", age=" + age
				+ ", marketValue=" + marketValue + ", presentOnTransferList=" + presentOnTransferList + ", playerType="
				+ playerType + "]";
	}

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

	public boolean isPresentOnTransferList() {
		return presentOnTransferList;
	}

	public void setPresentOnTransferList(boolean presentOnTransferList) {
		this.presentOnTransferList = presentOnTransferList;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

}
