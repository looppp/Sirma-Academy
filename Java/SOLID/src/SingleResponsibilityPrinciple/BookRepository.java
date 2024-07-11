package SingleResponsibilityPrinciple;

import java.io.FileWriter;
import java.io.IOException;

public class BookRepository {
    public void saveToDatabase(Book book){
        System.out.println(book.getBookSummary() + " saved in database.");
    }
}
