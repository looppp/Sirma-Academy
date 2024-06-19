import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.nextLine().toCharArray();
        ArrayDeque<Character> charStack = new ArrayDeque<>();
        boolean balanced = true;

        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '[' || charArray[i] == '{' || charArray[i] == '(') {
                charStack.push(charArray[i]);
            } else if(charArray[i] == ']' || charArray[i] == '}' || charArray[i] == ')'){
                char firstToPop = charStack.peek();
                if(firstToPop == '[' && charArray[i] == ']' || firstToPop == '{' && charArray[i] == '}' || firstToPop == '(' && charArray[i] == ')'){
                    charStack.pop();
                } else {
                    balanced = false;
                }
            }
        }

        System.out.println(balanced);
    }
}
