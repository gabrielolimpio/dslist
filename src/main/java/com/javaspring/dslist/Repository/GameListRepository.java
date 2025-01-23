package com.javaspring.dslist.Repository;

import com.javaspring.dslist.Entities.Game;
import com.javaspring.dslist.Entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
