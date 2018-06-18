package com.helper;

import static junit.framework.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

import com.entity.Player;
import com.entity.Team;
import com.model.PlayerType;

public class TestPlayersUtility {

	@SuppressWarnings("deprecation")
	@Test
	public void shouldTestGetTeam() {
		Team team = PlayersUtility.getTeam();
		assertEquals(team.getPlayers().size(), 20);
		assertEquals(team.getTeamName().length(), 6);
		assertEquals(team.getTeamValue(), BigInteger.valueOf(20000));

		for (Player player : team.getPlayers()) {
			assertEquals(player.getFirstName().length(), 6);
			assertEquals(player.getLastName().length(), 6);
			int age = player.getAge();
			assertEquals((age > 18 || age <= 40), true);
		}

		System.out.println(PlayerType.randomPlayer().getName());

	}

}
