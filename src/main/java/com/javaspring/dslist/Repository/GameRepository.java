package com.javaspring.dslist.Repository;

import com.javaspring.dslist.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
