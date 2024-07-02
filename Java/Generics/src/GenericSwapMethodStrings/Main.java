package GenericSwapMethodStrings;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedList<Box> listOfItems = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String item = sc.nextLine();
            Box<String> box = new Box<>(item);
            listOfItems.add(box);
        }

        String[] inputIndexes = sc.nextLine().split("\\s+");
        int indexOne = Integer.parseInt(inputIndexes[0]);
        int indexTwo = Integer.parseInt(inputIndexes[1]);

        SwapItems(listOfItems, indexOne, indexTwo);

        for (Box item : listOfItems){
            System.out.println(item);
        }
    }
    public static <T> void SwapItems(LinkedList<T> listOfItems, int indexOne, int indexTwo){
        if(indexOne < 0 || indexOne > listOfItems.size() || indexTwo < 0 || indexTwo > listOfItems.size()){
            throw new IndexOutOfBoundsException("Invalid indexes");
        }

        Collections.swap(listOfItems, indexOne, indexTwo);
    }
}
