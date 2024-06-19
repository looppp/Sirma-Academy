import java.util.Scanner;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author){
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public void Edit(String newContent){
        this.content = newContent;
    }

    public void ChangeAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void Rename(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return STR."\{this.title} - \{this.content}: \{this.author}";
    }

}
