import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String destination;
        String hollydayPlace = "Camp";

        if(budget <= 100){
            destination = "Somewhere in Bulgaria";
            if(season.equals("summer")){
                budget *= 0.3;
            } else {
                hollydayPlace = "Hotel";
                budget *= 0.7;
            }
        } else if (budget <= 1000){
            destination = "Somewhere in Europe";
            if(season.equals("summer")){
                budget *= 0.4;
            } else {
                hollydayPlace = "Hotel";
                budget *= 0.8;
            }
        } else {
            hollydayPlace = "Hotel";
            destination = "Somewhere in Asia";
            budget *= 0.9;
        }

        System.out.println(destination);
        System.out.printf("%s - %.2f", hollydayPlace, budget);

    }
}
