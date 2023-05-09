package edu.mfvp.dslist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mfvp.dslist.dto.GameMinDTO;
import edu.mfvp.dslist.entities.Game;
import edu.mfvp.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> games = gameRepository.findAll();
		List<GameMinDTO> gamesDTO = new ArrayList<>();
		for(Game g : games) {
			gamesDTO.add(new GameMinDTO(g));
		}
		return gamesDTO;
	}

}
