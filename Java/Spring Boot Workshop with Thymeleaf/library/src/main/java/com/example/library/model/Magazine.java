package com.example.library.model;

public class Magazine {
    private String title;
    private String publisher;
    private int year;
    private String issn;

    public Magazine(String title, String publisher, int year, String issn) {
        this.publisher = publisher;
        this.issn = issn;
        this.year = year;
        this.title = title;
    }

    public Magazine() {

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
}
