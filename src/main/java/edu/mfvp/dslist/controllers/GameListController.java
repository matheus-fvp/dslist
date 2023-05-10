package edu.mfvp.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mfvp.dslist.dto.GameDTO;
import edu.mfvp.dslist.dto.GameListDTO;
import edu.mfvp.dslist.dto.GameMinDTO;
import edu.mfvp.dslist.services.GameListService;
import edu.mfvp.dslist.services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}

}
