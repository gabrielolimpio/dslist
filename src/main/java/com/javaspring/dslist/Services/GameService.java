package com.javaspring.dslist.Services;

import com.javaspring.dslist.DTO.GameMinDTO;
import com.javaspring.dslist.Entities.Game;
import com.javaspring.dslist.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
