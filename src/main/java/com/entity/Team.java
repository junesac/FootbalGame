package com.entity;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.model.Country;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String teamName;

	@Enumerated(EnumType.STRING)
	private Country country;

	private List<Player> players;
	private BigInteger teamValue;
	private BigInteger teamBudget;

	public Team(String teamName, Country country, List<Player> players) {
		this.teamName = teamName;
		this.country = country;
		this.players = players;

		this.teamValue = BigInteger.ZERO;
		if (players != null && players.size() > 0) {
			for (Player player : players) {
				this.teamValue.add(player.getMarketValue());
			}
		}

		teamBudget = new BigInteger("5000");
	}

	public BigInteger getTeamBudget() {
		return teamBudget;
	}

	public void setTeamBudget(BigInteger teamBudget) {
		this.teamBudget = teamBudget;
	}

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
