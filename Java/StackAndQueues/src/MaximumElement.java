import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandLines = Integer.parseInt(sc.nextLine());
        String[] input ;
        ArrayDeque<Integer> stack = new ArrayDeque();
        int counter = 0;


       while(counter != commandLines){
           input = sc.nextLine().split("\\s+");
           switch (input[0]){
               case "1":
                   stack.push(Integer.parseInt(input[1]));
                   break;
               case "2":
                   stack.pop();
                   break;
               case "3":
                  int result = stack.stream().max(Integer::compareTo).orElse(-1);
                  if(result == -1) System.out.println("There are no numbers in the stack!");
                  else System.out.println(result);
                   break;
               default:
                   System.out.println("Invalid input");
                   break;
           }
           counter++;
       }
    }
}
