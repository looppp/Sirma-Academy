import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(",");
        int rotations = Integer.parseInt(sc.nextLine());
        int counter = 0;

        while(counter < rotations){
            String[] currentArray = new String[inputArray.length];
            for (int i = 0; i < inputArray.length ; i++) {
                if(i == inputArray.length - 1){
                    currentArray[0] = inputArray[i];
                } else {
                    currentArray[i + 1] = inputArray[i];
                }
            }

            inputArray = currentArray;
            counter++;
        }


        System.out.printf(String.join(" ", inputArray));
    }
}
