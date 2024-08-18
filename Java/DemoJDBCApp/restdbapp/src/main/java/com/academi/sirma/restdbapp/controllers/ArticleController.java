package com.academi.sirma.restdbapp.controllers;

import com.academi.sirma.restdbapp.models.Article;
import com.academi.sirma.restdbapp.services.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createArticle(@RequestBody Article article){
        try {
            articleService.addArticle(article);
        } catch (Exception e){
           return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok("Success");
    }
}
