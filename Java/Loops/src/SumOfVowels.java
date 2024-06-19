import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        int sumOfVowels = 0;

        for (int i = 0; i < inputWord.length(); i++) {
            char currentChar = toLowerCase(inputWord.charAt(i));
            switch (currentChar){
                case 'a':
                    sumOfVowels += 1;
                    break;
                case 'e':
                    sumOfVowels += 2;
                    break;
                case 'i':
                    sumOfVowels += 3;
                    break;
                case 'o':
                    sumOfVowels += 4;
                    break;
                case 'u':
                    sumOfVowels += 5;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sumOfVowels);

    }
}
