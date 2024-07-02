package GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> integerScale = new Scale<>(5, 3);
        System.out.println("The heavier element is: " + integerScale.getHeavier());
        Scale<String> stringScale = new Scale<>("Hello", "3");
        System.out.println("The heavier element is: " + stringScale.getHeavier());
        Scale<Character> charScale = new Scale<>('A', 'B');
        System.out.println("The heavier element is: " + charScale.getHeavier());
    }
}
