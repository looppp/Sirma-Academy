import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> arrayOfURL = new ArrayDeque<>();
        String currentPage = "";
        String input = sc.nextLine();

        while(!input.equals("Home")){
            if(input.equals("back")){
                if(arrayOfURL.size() == 0){
                    System.out.println("no previous URLs");
                } else {
                    currentPage = arrayOfURL.pop();
                    if(currentPage.isEmpty()){
                        System.out.println("no previous URLs");
                    } else {
                        System.out.println(currentPage);
                    }
                }
            } else if(currentPage.isEmpty()){
                currentPage = input;
                System.out.println(currentPage);
            } else {
                arrayOfURL.push(currentPage);
                currentPage = input;
                System.out.println(currentPage);
            }
             input = sc.nextLine();
        }
    }
}
