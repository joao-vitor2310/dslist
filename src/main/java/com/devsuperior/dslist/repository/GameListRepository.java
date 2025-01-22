package com.devsuperior.dslist.repository;

import com.devsuperior.dslist.model.Game;
import com.devsuperior.dslist.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    Long id(Long id);
}
