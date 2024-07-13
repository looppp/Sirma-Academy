package LiskovSubstitutionPrinciple.Penguins;

public class Eagle extends Bird implements FlyingBird{
    @Override
    public void fly() {
        System.out.println("Eagle is flying.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screeches.");
    }
}
