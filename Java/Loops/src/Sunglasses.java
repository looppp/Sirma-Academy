import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sunglassesSize = Integer.parseInt(sc.nextLine());
        boolean rangeCheck = sunglassesSize >= 3 && sunglassesSize <= 100;

        for (int i = 1; i <= sunglassesSize && rangeCheck; i++) {
            if(i == 1 || i == sunglassesSize){
                String firstAndLastStars = "* ".repeat(sunglassesSize * 2);
                String firstAndLastSpaces = " ".repeat(sunglassesSize * 2);
                System.out.printf("%s%s%s%n",firstAndLastStars, firstAndLastSpaces,firstAndLastStars);
            } else {
                int bridgeRow = (int) Math.ceil(sunglassesSize / 2.0);
                if(bridgeRow == i){
                    String slashes = "/ ".repeat(sunglassesSize * 2 - 2);
                    String bridgeSymbols = "| ".repeat(sunglassesSize);
                    System.out.printf("* %s* %s* %s* %n", slashes, bridgeSymbols, slashes);
                } else {
                    String slashes = "/ ".repeat(sunglassesSize * 2 - 2);
                    String spaces = " ".repeat(sunglassesSize * 2);
                    System.out.printf("* %s* %s* %s* %n", slashes, spaces, slashes);
                }

            }

        }
    }
}
