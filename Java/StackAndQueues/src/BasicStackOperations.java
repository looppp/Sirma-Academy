import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementsToPush = sc.nextInt();
        int elementsToPop = sc.nextInt();
        int elementToFind = sc.nextInt();
        String empty = sc.nextLine();
        int[] inputIntegers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> integersDeque = new ArrayDeque<>();
        int cycles = elementsToPush - elementsToPop;

        if(cycles <= 0){
            System.out.println(0);
        } else {
            for (int i = 0; i < cycles; i++) {
                integersDeque.push(inputIntegers[i]);
            }
            if(integersDeque.contains(elementToFind)){
                System.out.println("ture");
            } else {
                System.out.println(Collections.min(integersDeque));
            }
        }

    }
}
