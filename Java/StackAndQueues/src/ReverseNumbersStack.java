import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> inputIntegers = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(inputIntegers::add);

       for (int number : inputIntegers.reversed()) System.out.printf("%d ", number);

    }
}
