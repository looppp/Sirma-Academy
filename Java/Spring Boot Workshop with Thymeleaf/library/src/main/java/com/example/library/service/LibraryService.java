package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    public CsvService csvService;

    public List<Book> getBooks(){
        return  csvService.readBooks();
    }

    public List<Magazine> getMagazines(){
        return  csvService.readMagazines();
    }

    public void addBook(Book book){
        csvService.saveBook(book);
    }

    public void addMagazine(Magazine magazine){
        csvService.saveMagazine(magazine);
    }
}
