import java.util.ArrayDeque;
import java.util.Scanner;

public class LegendaryDuels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String duelInput = sc.nextLine();
        boolean isLegendary = true;
        ArrayDeque<Character> strikes = new ArrayDeque<>();

        for (char c : duelInput.toCharArray()){
            if(c == '(' || c == '!' || c == '{'){
                strikes.push(c);
            } else if(!strikes.isEmpty()){
                if(c == ')' && strikes.peek() == '(' || c == '}' && strikes.peek() == '{' || c == strikes.peek()){
                    strikes.pop();
                } else {
                    isLegendary = false;
                }
            } else {
                isLegendary = false;
            }
        }
        if(!strikes.isEmpty()){
            isLegendary = false;
        }
        if(isLegendary){
            System.out.println("Legendary");
        } else {
            System.out.println("Not Legendary");
        }
    }
}
