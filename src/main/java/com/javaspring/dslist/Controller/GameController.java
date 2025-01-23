package com.javaspring.dslist.Controller;

import com.javaspring.dslist.DTO.GameDTO;
import com.javaspring.dslist.DTO.GameMinDTO;
import com.javaspring.dslist.Entities.Game;
import com.javaspring.dslist.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(Game game) {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findBydId(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
}
