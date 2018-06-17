package com.model;

import java.math.BigInteger;
import java.util.List;

public class Team {

	private String teamName;
	private Country country;
	private List<Player> players;
	private BigInteger teamValue;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public BigInteger getTeamValue() {
		return teamValue;
	}

	public void setTeamValue(BigInteger teamValue) {
		this.teamValue = teamValue;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", country=" + country + ", players=" + players + ", teamValue="
				+ teamValue + "]";
	}

}
