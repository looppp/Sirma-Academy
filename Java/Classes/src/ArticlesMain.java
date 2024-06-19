import java.util.Scanner;

public class ArticlesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArticle = sc.nextLine().split(", ");
        int lines = Integer.parseInt(sc.nextLine());
        String title = inputArticle[0];
        String content = inputArticle[1];
        String author = inputArticle[2];
        Articles article = new Articles(title, content, author);

        for (int i = 0; i < lines; i++) {
            String[] inputTokens = sc.nextLine().split(":");
            String command = inputTokens[0];
            String input = inputTokens[1].trim();

            if(command.toLowerCase().equals("edit")){
                article.Edit(input);
            } else if(command.toLowerCase().equals("changeauthor:")){
                article.ChangeAuthor(input);
            } else if(command.toLowerCase().equals("rename")){
                article.Rename(input);
            }
        }

        System.out.println(article);
    }
}
