import java.util.Scanner;

public class MoviesClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personAge = Integer.parseInt(sc.nextLine());

        if(personAge < 13){
            System.out.println("U-rated movies");
        } else if(personAge >= 13 && personAge <= 17){
            System.out.println("U and PG-13 rated movies");
        } else {
            System.out.println("All movies");
        }
    }
}
