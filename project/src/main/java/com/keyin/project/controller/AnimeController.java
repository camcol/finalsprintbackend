package com.keyin.project.controller;

import com.keyin.project.model.Anime;
import com.keyin.project.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anime")
@CrossOrigin

public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @PostMapping("/add")
    public String add(@RequestBody Anime anime){
        animeService.saveAnime(anime);
        return "New anime added";
    }
}
