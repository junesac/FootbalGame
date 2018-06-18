package com.helper;

import com.entity.Team;

public class TestPlayersUtility {

	public static void main(String[] args) {
		Team team = PlayersUtility.getTeam(20);
		System.out.println(team);
	}

}
