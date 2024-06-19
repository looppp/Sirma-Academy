import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputString = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayList::new));
        Random random = new Random();

        for (int i = 0; i < inputString.size(); i++) {
            int randomIndex = random.nextInt(inputString.size());
            System.out.println(inputString.get(randomIndex));
        }
    }
}
