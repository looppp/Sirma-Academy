package com.sirma.footballapi.controller;

import com.sirma.footballapi.dto.PlayerDTO;
import com.sirma.footballapi.service.PairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pairs")
public class PairController {

    @Autowired
    private PairService pairService;

    @GetMapping("/")
    public PlayerDTO getLongestPlayingPair(){
        return pairService.findLongestPlayingPair();
    }
}
