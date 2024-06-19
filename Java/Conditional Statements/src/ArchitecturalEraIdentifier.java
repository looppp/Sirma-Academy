import java.util.Scanner;

public class ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        String material = sc.nextLine();
        String output = "";

        if(year < 500 && material.equals("stone")){
            output = "Ancient";
        } else if(year >= 500 && year <= 1500 && material.equals("stone")){
            output = "Medieval";
        } else if(year >= 1500 && year <= 1800 && material.equals("wood")){
            output = "Colonial";
        } else if(year >= 1800 && year <= 1900 && material.equals("steel")){
            output = "Industrial";
        } else if(year > 1900 && material.equals("steel")){
            output = "Modern";
        } else {
            output = "Uncertain";
        }

        System.out.println(output);
    }
}
