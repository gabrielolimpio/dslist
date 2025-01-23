package com.javaspring.dslist.Controller;

import com.javaspring.dslist.DTO.GameListDTO;
import com.javaspring.dslist.DTO.GameMinDTO;
import com.javaspring.dslist.Entities.Game;
import com.javaspring.dslist.Services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(Game game) {
        return gameListService.findAll();
    }

}
