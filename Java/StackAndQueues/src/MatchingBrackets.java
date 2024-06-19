import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] inputExpression = sc.nextLine().toCharArray();
        ArrayDeque<Integer> bracketsIndexes = new ArrayDeque<>();

        for (int i = 0; i < inputExpression.length; i++) {
            char currentChar = inputExpression[i];
            if(currentChar == ('(')){
                bracketsIndexes.push(i);
            } else if (currentChar == ')'){
                int startIndex = bracketsIndexes.pop();
                for (int j = startIndex; j <= i; j++) {
                    System.out.printf("%c ", inputExpression[j]);
                }
                System.out.println();

            }
        }
    }
}
