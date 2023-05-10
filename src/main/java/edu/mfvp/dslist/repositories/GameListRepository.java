package edu.mfvp.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mfvp.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
