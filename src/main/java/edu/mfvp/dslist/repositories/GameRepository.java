package edu.mfvp.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mfvp.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
