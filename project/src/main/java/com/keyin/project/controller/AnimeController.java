package com.keyin.project.controller;

import com.keyin.project.model.Anime;
import com.keyin.project.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anime")

public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @PostMapping("/add")
    public String add(@RequestBody Anime anime){
        animeService.saveAnime(anime);
        return "New anime added";
    }
}
