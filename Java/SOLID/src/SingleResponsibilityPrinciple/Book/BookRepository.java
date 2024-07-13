package SingleResponsibilityPrinciple.Book;

public class BookRepository {
    public void saveToDatabase(Book book){
        System.out.println(book.getBookSummary() + " saved in database.");
    }
}
