package edu.mfvp.dslist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mfvp.dslist.dto.GameDTO;
import edu.mfvp.dslist.dto.GameMinDTO;
import edu.mfvp.dslist.entities.Game;
import edu.mfvp.dslist.projections.GameMinProjection;
import edu.mfvp.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> games = gameRepository.findAll();
		List<GameMinDTO> gamesDTO = new ArrayList<>();
		for(Game g : games) {
			gamesDTO.add(new GameMinDTO(g));
		}
		return gamesDTO;
	}
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		List<GameMinDTO> gamesDTO = new ArrayList<>();
		for(GameMinProjection g : games) {
			gamesDTO.add(new GameMinDTO(g));
		}
		return gamesDTO;
	}
	
	

}
