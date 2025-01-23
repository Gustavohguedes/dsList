package com.henriquegustavo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquegustavo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
