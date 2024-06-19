import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int levs = Integer.parseInt(input[0]);
        int stotinki = Integer.parseInt(input[1]);
        int countOfCoins = 0;

       while(stotinki > 0 || levs > 0){
           if(levs - 2 >= 0){
               levs -= 2;
               countOfCoins++;
           } else if(levs - 1 >= 0){
               levs -= 1;
               countOfCoins++;
           }
           if(stotinki - 50 >= 0){
               stotinki -= 50;
               countOfCoins++;
           } else if (stotinki - 20 >= 0){
               stotinki -= 20;
               countOfCoins++;
           } else if (stotinki - 10 >= 0){
               stotinki -= 10;
               countOfCoins++;
           } else if (stotinki - 5 >= 0){
               stotinki -= 5;
               countOfCoins++;
           } else if (stotinki - 2 >= 0){
               stotinki -= 2;
               countOfCoins++;
           } else if (stotinki - 1 >= 0){
               stotinki -= 1;
               countOfCoins++;
           }
       }

       System.out.println(countOfCoins);
    }
}
