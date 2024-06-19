import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int repeatN = Integer.parseInt(sc.nextLine());

        RepeatTheString(inputString, repeatN);
    }
    public static void RepeatTheString(String input, int repeater){
        System.out.println(input.repeat(repeater));
    }
}
