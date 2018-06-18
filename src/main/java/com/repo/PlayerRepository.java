package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {

}
