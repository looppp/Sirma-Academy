import java.util.Scanner;

public class AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemOne = sc.nextLine();
        String itemTwo = sc.nextLine();
        String pathToTake = "";

        if(itemOne.equals("sword") || itemTwo.equals("sword")){
            if(itemOne.equals("shield") || itemTwo.equals("shield")){
                pathToTake = "Path to the castle";
            } else {
                pathToTake = "Path to the forest";
            }
        }
        if(itemOne.equals("map") || itemTwo.equals("map")){
            if(itemOne.equals("coins") || itemTwo.equals("coins")){
                pathToTake = "Go to the town";
            } else {
                pathToTake = "Camp at the current spot and prepare for the next day.";
            }
        }
        if(pathToTake.isEmpty()){
            pathToTake = "Wander aimlessly";
        }
        System.out.println(pathToTake);
    }
}
