import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = Integer.parseInt(sc.nextLine());
        System.out.print(inputNumber);

        while(!(inputNumber == 1)){
            if(inputNumber % 2 == 0){
                inputNumber /= 2;
            } else {
                inputNumber = (inputNumber * 3) + 1;
            }
            System.out.printf(" %d", inputNumber);

        }
    }
}
