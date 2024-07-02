package GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Integer input = Integer.parseInt(sc.nextLine());
            Box<Integer> box = new Box<>(input);
            System.out.println(box);
        }
    }
}
