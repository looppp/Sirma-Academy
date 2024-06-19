import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementsToEnqueue = sc.nextInt();
        int elementsToDequeue = sc.nextInt();
        int elementToFind = sc.nextInt();
        String empty = sc.nextLine();
        int[] inputIntegers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> integersDeque = new ArrayDeque<>();
        int cycles = elementsToEnqueue - elementsToDequeue;

        if(cycles <= 0){
            System.out.println(0);
        } else {
            for (int i = cycles; i > 0; i--) {
                integersDeque.offer(inputIntegers[i]);
            }
            if(integersDeque.contains(elementToFind)){
                System.out.println("ture");
            } else {
                System.out.println(Collections.min(integersDeque));
            }
        }
    }
}
