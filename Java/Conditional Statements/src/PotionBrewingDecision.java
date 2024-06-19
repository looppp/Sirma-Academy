import java.util.Scanner;

public class PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ingredientOne = sc.nextLine();
        String ingredientTwo = sc.nextLine();
        String potion = "";

        if(ingredientOne.equals("herbs") || ingredientTwo.equals("herbs")){
            if(ingredientOne.equals("water") || ingredientTwo.equals("water")){
                potion = "Health potion";
            } else if(ingredientOne.equals("oil") || ingredientTwo.equals("oil")){
                potion = "Strealth potion";
            } else {
                potion = "Minor stamina potion";
            }
        }
        if(ingredientOne.equals("berries") || ingredientTwo.equals("berries")){
            if(ingredientOne.equals("sugar") || ingredientTwo.equals("sugar")){
                potion = "Speed potion";
            } else {
                potion = "Minor energy potion";
            }
        }
        if(potion.isEmpty()){
            potion = "No potion";
        }

        System.out.println(potion);
    }
}
