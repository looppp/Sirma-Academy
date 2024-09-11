package com.sirma.footballapi.controller;

import com.sirma.footballapi.dto.PlayerDTO;
import com.sirma.footballapi.service.PairService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pairs")
@Slf4j
public class PairController {

    @Autowired
    private PairService pairService;

    @GetMapping
    public PlayerDTO getLongestPlayingPair(){
        log.info("Getting pair result");
        return pairService.findLongestPlayingPair();
    }
}
