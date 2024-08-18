package com.academi.sirma.restdbapp.repositories;

import com.academi.sirma.restdbapp.models.Article;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository {
    private JdbcTemplate jdbcTemplate;

    public ArticleRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveArticle(Article article){
        String sql = "INSERT INTO articles (title, content, user_id) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, article.getTitle(), article.getContent(), article.getUserId());
    }
}
