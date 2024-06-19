import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> kidsInStack = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+")).forEach(kidsInStack::push);
        int tossPotato = Integer.parseInt(sc.nextLine());

        while(kidsInStack.size() > 1){
            for (int i = 0; i < tossPotato; i++) {
                if(i == tossPotato - 1){
                    System.out.printf("Remove %s%n", kidsInStack.pollLast());
                } else {
                    String fistKid = kidsInStack.pollLast();
                    kidsInStack.push(fistKid);
                }

            }
        }
        System.out.printf("Last is %s", kidsInStack.pollFirst());
    }
}
