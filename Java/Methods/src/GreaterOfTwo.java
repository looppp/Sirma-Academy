import java.util.Scanner;

public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputType = sc.nextLine();
        if(inputType.toLowerCase().equals("int")){
            int firstNumber = Integer.parseInt(sc.nextLine());
            int secondNumber = Integer.parseInt(sc.nextLine());
            System.out.println(GreaterOfTwoValues(firstNumber, secondNumber));

        } else if(inputType.toLowerCase().equals("char")){
            char firstChar = sc.nextLine().charAt(0);
            char secondChar = sc.nextLine().charAt(0);
            System.out.println(GreaterOfTwoValues(firstChar, secondChar));
        } else if(inputType.toLowerCase().equals("string")){
            String firstString = sc.nextLine();
            String secondString = sc.nextLine();
            System.out.println(GreaterOfTwoValues(firstString, secondString));
        }

    }
    public static char GreaterOfTwoValues(char inputA, char inputB){
        return (char) Math.max(inputA, inputB);
    }
    public static int GreaterOfTwoValues(int inputA, int inputB){
        return Math.max(inputA, inputB);
    }
    public static String GreaterOfTwoValues(String inputA, String inputB){
        return (inputA.compareTo(inputB) > 0) ?  inputA :  inputB;
    }
}
