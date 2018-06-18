package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

}
