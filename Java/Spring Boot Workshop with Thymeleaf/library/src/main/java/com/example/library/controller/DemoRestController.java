package com.example.library.controller;

import com.example.library.model.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoRestController {

    @GetMapping("/movies")
    public List<Book> getBook(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Shadows of the Empire", "J.K. Hunter", 1998, "978-0451197940");
        Book book2 = new Book("The Silent Forest", "E. L. Drake", 2005, "978-0553588484");
        Book book3 = new Book("Whispers in the Dark", "Ava Stone", 2012, "978-0061967576");
        Book book4 = new Book("Journey to the Stars", "Raymond Masters", 1987, "978-0140077024");
        Book book5 = new Book("Echoes of Eternity", "Morgan Chase", 2019, "978-0312537080");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        return books;
    }
}
