import java.util.Scanner;

public class MoviesTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageInput = Integer.parseInt(sc.nextLine());
        int ticketPrice;

        if(ageInput >= 0 && ageInput <= 12){
            ticketPrice = 5;
        } else if(ageInput >= 13 && ageInput <= 19){
            ticketPrice = 8;
        } else {
            ticketPrice = 10;
        }

        System.out.printf("$%d", ticketPrice);
    }
}
