import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double latitude = Math.abs(Double.parseDouble(sc.nextLine()));
        char hemisphere = sc.nextLine().charAt(0);
        String outputZone = "";

        if(latitude > 66.5){
            outputZone = "Arctic Zone";
        } else if (latitude > 23.5 && latitude <= 66.5){
            outputZone = "Temperate Zone";
        } else if (latitude > 0 && latitude <= 23.5){
            outputZone = "Tropic Zone";
        } else if(latitude == 0){
            outputZone = "Equator";
        }

        System.out.println(outputZone);
    }
}
