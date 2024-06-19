public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private int fuel;

    public Vehicle(String type, String model, Engine engine, int fuel){
        this.type = type;
        this.engine = engine;
        this.model = model;
        this.fuel = fuel;
    }

    public void drive(double fuelLoss){
        this.fuel -= fuelLoss;
    }

    public static void main(String[] args) {
        Engine engine = new Engine(100);
        var vehicle = new Vehicle("a", "b", engine, 200);
        vehicle.drive(100);
        System.out.println(vehicle.fuel);

    }
}

