package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Team;
import com.helper.PlayersUtility;
import com.repo.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public Team getTeam() {
		teamRepository.save(PlayersUtility.getTeam());
		return PlayersUtility.getTeam();
	}

}
