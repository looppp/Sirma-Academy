package LiskovSubstitutionPrinciple.Penguins;

public class Penguin extends Bird{
    @Override
    public void makeSound() {
        System.out.println("Penguin squawks.");
    }

    public void swim(){
        System.out.println("Penguin is swimming");
    }
}
