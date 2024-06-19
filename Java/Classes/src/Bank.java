import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkEnd = true;
        HashMap<Integer, BankAccount> accountsRegistry = new HashMap<>();

        while(checkEnd){
            String[] command = sc.nextLine().split("\\s+");

            if(command[0].equals("Create")){
                BankAccount account = new BankAccount();
                System.out.println(STR."Account ID\{account.getId()} created");
                accountsRegistry.put(account.getId(), account);

            } else if(command[0].equals("Deposit")){
                int id = Integer.parseInt(command[1]);
                if(accountsRegistry.containsKey(id)){
                    int depositAmount = Integer.parseInt(command[2]);
                    accountsRegistry.get(id).deposit(depositAmount);
                } else {
                    System.out.println("Account does not exist");
                }

            } else if(command[0].equals("SetInterest")){
                BankAccount.setInterestRate(1.5);
            } else if(command[0].equals("GetInterest")){
                int id = Integer.parseInt(command[1]);
                int interest = Integer.parseInt(command[2]);
                if(accountsRegistry.containsKey(id)){
                    System.out.println(Math.floor(accountsRegistry.get(id).getInterest(interest)));
                } else {
                    System.out.println("Account does not exist");
                }
            } else if(command[0].equals("End")){
                checkEnd = false;
            }
        }
    }
}

