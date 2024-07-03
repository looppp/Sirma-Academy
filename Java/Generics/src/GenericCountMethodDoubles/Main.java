package GenericCountMethodDoubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        LinkedList<Double> listOfItems = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            listOfItems.add(Double.parseDouble(reader.readLine()));
        }
        Double itemToCompare = Double.parseDouble(reader.readLine());
        System.out.println(compareItemToListOfItems(listOfItems, itemToCompare));

    }
    public static <T extends Comparable<T>> int compareItemToListOfItems(List<T> list, T item){
        int countOfGreaterElements = 0;
        for (T listItem : list){
            int result = listItem.compareTo(item);
            if(result > 0){
                countOfGreaterElements++;
            }
        }
        return countOfGreaterElements;
    }
}
