package JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<String> jarOfStrings = new Jar<>();
        jarOfStrings.add("Strawberry");
        jarOfStrings.add("Itchigo");
        jarOfStrings.remove();
    }
}
