package LiskovSubstitutionPrinciple.Engine;

public class Main {
    public static void main(String[] args) {
        CombustionEngine gasolineEngine = new GasolineEngine();
        gasolineEngine.start();

        CombustionEngine dieselEngine = new DieselEngine();
        dieselEngine.start();

        ElectricEngine electricEngine = new ElectricCarEngine();
        electricEngine.start();
    }
}
