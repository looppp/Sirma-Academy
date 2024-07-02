package GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = ArrayCreator.create(5, 10);
        for (int number : integerArray) System.out.println(number);

        String[] stringArray = ArrayCreator.create(String.class, 5, "Pasta");
        for (String item : stringArray) System.out.println(item);
    }
}
