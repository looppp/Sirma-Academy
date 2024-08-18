package com.academi.sirma.restdbapp.models;

import jakarta.validation.constraints.*;

public class Article {
    private int id;

    @NotEmpty(message = "Title cannot be empty.")
    @Size(min = 5, max = 100, message = "Title must be between 5 and 100 characters.")
    private String title;

    @NotEmpty(message = "Content cannot be empty.")
    @Size(min = 20, message = "Content must be at least 20 characters long.")
    private String content;


    private long userId;

    public Article(int id, String title, String content, long userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
