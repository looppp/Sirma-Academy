package com.academi.sirma.restdbapp.services;

import com.academi.sirma.restdbapp.models.Article;
import com.academi.sirma.restdbapp.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public String addArticle(Article article){
        try {
            articleRepository.saveArticle(article);
        } catch (Exception e){
            return e.getMessage();
        }
        return "Article is saved to database";
    }
}
