package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.Magazine;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvService {
    private static final String BOOKS_FILE = "./src/main/resources/books.csv";
    private static final String MAGAZINES_FILE = "./src/main/resources/magazines.csv";

    public List<Book> readBooks() {
        List<Book> books = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(BOOKS_FILE))){
            String line;
            while((line = reader.readLine()) != null){
                String[] fields = line.split(",");
                Book book = new Book(
                        fields[0],
                        fields[1],
                        Integer.parseInt(fields[2].trim()),
                        fields[3]);
                books.add(book);
            }

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        return books;
    }


    public void saveBook(Book book) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(BOOKS_FILE, true))){
            String line = book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear() + ", " + book.getIsbn();
            writer.write(line);
            writer.newLine();

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public List<Magazine> readMagazines() {
        List<Magazine> magazines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(MAGAZINES_FILE))){
            String line;
            while((line = reader.readLine()) != null){
                String[] fields = line.split(",");
                Magazine book = new Magazine(
                        fields[0],
                        fields[1],
                        Integer.parseInt(fields[2].trim()),
                        fields[3]);
                magazines.add(book);
            }

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        return magazines;
    }


    public void saveMagazine(Magazine magazine) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(MAGAZINES_FILE, true))){
            String line = magazine.getTitle() + ", " + magazine.getPublisher() + ", " + magazine.getYear() + ", " + magazine.getIssn();
            writer.write(line);
            writer.newLine();

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}
