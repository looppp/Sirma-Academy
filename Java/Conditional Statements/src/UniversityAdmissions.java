import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = Integer.parseInt(sc.nextLine());
        int extracurriculars = Integer.parseInt(sc.nextLine());

        if(score >= 90 || score >= 80 && score <= 89 && extracurriculars >= 2){
            System.out.println("Admitted");
        } else {
            System.out.println("Not admitted");

        }
    }
}
