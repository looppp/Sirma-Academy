import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyToSpend = Double.parseDouble(sc.nextLine());
        int countOfStudents = Integer.parseInt(sc.nextLine());
        double priceOfLightSaber = Double.parseDouble(sc.nextLine());
        double priceOfRobe = Double.parseDouble(sc.nextLine());
        double priceOfBelt = Double.parseDouble(sc.nextLine());
        double totalCost = 0.0;
        double countOfStudentsWithTax = Math.ceil(countOfStudents * 1.1);
        

        totalCost = (countOfStudentsWithTax * priceOfLightSaber) + 
                (priceOfRobe * countOfStudents) + (priceOfBelt * countOfStudents);

        if(countOfStudents / 6 >= 1 ){
            totalCost -= Math.floor((double)countOfStudents / 6);
        }
        if(moneyToSpend >= totalCost){
            System.out.printf("The money is enough - it would cost %.2flv.",totalCost);
        } else {
            double neededMoney = Math.abs(totalCost - moneyToSpend);
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }

    }
}
