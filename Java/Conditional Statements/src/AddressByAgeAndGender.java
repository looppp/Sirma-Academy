import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String gender = sc.nextLine();

        if(gender.equals("f")){
            if(age < 16){
                System.out.println("Miss");
            } else{
                System.out.println("Ms.");
            }
        }
        if(gender.equals("m")){
            if(age < 16){
                System.out.println("Master");
            } else{
                System.out.println("Mr.");
            }
        }
    }
}
