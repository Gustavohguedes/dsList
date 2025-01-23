package com.henriquegustavo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquegustavo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
