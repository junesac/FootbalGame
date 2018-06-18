package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.entity.Team;
import com.repo.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public Team getTeam() {
		// teamRepository.save(PlayersUtility.getTeam());
		return teamRepository.findAll().iterator().next();
	}

	@PreAuthorize("@accessManager.hasRole({ 'ADMIN' })")
	public List<Team> getAllTeams() {

		List<Team> teams = new ArrayList<>();
		teamRepository.findAll().forEach(teams::add);
		return teams;
	}

}
