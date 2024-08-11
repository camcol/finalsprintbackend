package com.keyin.project.service;

import com.keyin.project.model.Anime;
import com.keyin.project.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    private AnimeRepository animeRepository;

    @Override
    public Anime saveAnime(Anime anime) {
        return animeRepository.save(anime);
    }

    @Override
    public List<Anime> getAllAnime() {
        return animeRepository.findAll();
    }

    public List<Anime> searchAnime(String keyword) {
        return animeRepository.searchByName(keyword);
    }
}
