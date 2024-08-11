package com.keyin.project.service;

import com.keyin.project.model.Anime;

import java.util.List;

public interface AnimeService {
    public Anime saveAnime(Anime anime);
    public List<Anime> getAllAnime();

    List<Anime> searchAnime(String keyword);
}
