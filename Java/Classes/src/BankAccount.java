import java.util.Scanner;

public class BankAccount {
    private static int idCounter = 0;
    private int id;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount(){
        idCounter++;
        this.id = idCounter;
        this.balance = 0;
    }
    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years){
        return balance * Math.pow(1 + interestRate, years) - balance;
    }

    public void deposit(double amount){
            this.balance += amount;
        System.out.println(STR."Deposited \{amount} to ID\{id}");
    }
    public int getId(){
        return this.id;
    }
}

