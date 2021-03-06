package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Team;
import com.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping("/get")
	public Team getTeam() {
		return teamService.getTeam();
	}

	@RequestMapping("/getAllTeams")
	public List<Team> getAllTeams() {
		return teamService.getAllTeams();
	}

}
