package com.javaspring.dslist.Services;

import java.util.List;

import com.javaspring.dslist.DTO.GameListDTO;
import com.javaspring.dslist.Entities.GameList;
import com.javaspring.dslist.Repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}