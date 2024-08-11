package com.keyin.project.repository;

import com.keyin.project.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Integer> {

    @Query(value = "SELECT a FROM Anime a WHERE a.name LIKE %:keyword%")
    List<Anime> searchByName(@Param("keyword") String keyword);

}
