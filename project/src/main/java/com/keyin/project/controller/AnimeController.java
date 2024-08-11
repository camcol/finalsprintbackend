package com.keyin.project.controller;

import com.keyin.project.model.Anime;
import com.keyin.project.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAll")
    public List<Anime> getAllAnime(){
        return animeService.getAllAnime();
    }

    @GetMapping("/search")
    public List<Anime> search(@RequestParam("keyword") String keyword) {
        return animeService.searchAnime(keyword);
    }
}
