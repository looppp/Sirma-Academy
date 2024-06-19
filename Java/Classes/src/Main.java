import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(sc.nextLine());
        Car[] cars = new Car[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            String[] inputInfo = sc.nextLine().split("\\s+");
            String brand = inputInfo[0];
            if(inputInfo.length == 3){
                int horsePower = Integer.parseInt(inputInfo[2]);
                String model = inputInfo[1];
                Car newCar = new Car(brand, model, horsePower);
                cars[i] = newCar;
            } else if(inputInfo.length == 2){
                String model = inputInfo[1];
                Car newCar = new Car(brand, model);
                cars[i] = newCar;
            } else {
                Car newCar = new Car(brand);
                cars[i] = newCar;
            }
        }
        for (Car car : cars) System.out.println(car.carInfo());
    }
}