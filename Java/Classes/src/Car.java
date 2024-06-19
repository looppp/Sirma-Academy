public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.horsePower = horsePower;
        this.brand = brand;
        this.model = model;
    }
    public Car(String brand){
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.horsePower = -1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String carInfo(){
        return STR."The car is: \{brand} \{model} – \{horsePower} HP.";
    }
}
