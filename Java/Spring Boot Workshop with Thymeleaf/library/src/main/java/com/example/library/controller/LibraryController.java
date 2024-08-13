package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.model.Magazine;
import com.example.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LibraryController {
    @Autowired
    private LibraryService service;

    @GetMapping("/books")
    public String viewBooks(Model model){
        model.addAttribute("book", new Book());
        model.addAttribute("books", service.getBooks());

        return "books";
    }

    @PostMapping("/books")
    public String addBook(@ModelAttribute Book book){
        service.addBook(book);
        return "redirect:/books";
    }

    @GetMapping("/magazines")
    public String viewMagazines(Model model){
        model.addAttribute("magazine", new Magazine());
        model.addAttribute("magazines", service.getMagazines());

        return "magazines";
    }

    @PostMapping("/magazines")
    public String addMagazine(@ModelAttribute Magazine magazine){
        service.addMagazine(magazine);
        return "redirect:/magazines";
    }

}

