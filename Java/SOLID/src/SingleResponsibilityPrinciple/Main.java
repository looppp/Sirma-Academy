package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("The lord of the rings", "John Ronald Reuel Tolkien");

        BookRepository repository = new BookRepository();
        repository.saveToDatabase(bookOne);

    }

}
