import java.text.DecimalFormat;
import java.util.Scanner;

public class FaceOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figureType = sc.nextLine();
        DecimalFormat df = new DecimalFormat("#.##");
        double result = 0.0;

        switch (figureType.toLowerCase()){
            case "square":
                double sideLength = Double.parseDouble(sc.nextLine());
                result = sideLength * sideLength;
                break;
            case "rectangle":
                double sideX = Double.parseDouble(sc.nextLine());
                double sideY = Double.parseDouble(sc.nextLine());
                result = sideX * sideY;
                break;
            case "circle":
                double radius = Double.parseDouble(sc.nextLine());
                result = Math.PI * radius * radius;
                break;
            case "triangle":
                double side = Double.parseDouble(sc.nextLine());
                double height = Double.parseDouble(sc.nextLine());
                result = (side * height) / 2;
                break;
            default:
                System.out.println("Invalid figure type.");
        }
        System.out.printf("%.2f", result);

    }
}
