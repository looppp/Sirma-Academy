import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int cycles = input * 2 - 2;
        for (int i = 1; i <= cycles; i++) {
            if(i >= input){
                System.out.printf("%s%s%n", " ".repeat(input / 2 ), "*".repeat(input - 1));
            } else {
                System.out.printf("%s%s%n", " ".repeat(input - i), "* ".repeat(i));
            }
        }
    }
}
