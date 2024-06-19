import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> pagesToPrint = new ArrayDeque<>();
        String input = sc.nextLine();

        while (!input.equals("print")){
            if(input.equals("cancel")){
                if(pagesToPrint.isEmpty()){
                    System.out.println("Standby");
                } else {
                    System.out.printf("Canceled %s%n", pagesToPrint.pollFirst());
                }
            } else {
                pagesToPrint.offer(input);
            }
            input = sc.nextLine();
        }

       while(!pagesToPrint.isEmpty()){
           System.out.println(pagesToPrint.pollFirst());
       }
    }
}
