import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        ArrayList<Student> listOfStudents = new ArrayList<>();

        while (!input[0].equals("end")) {
            int age = Integer.parseInt(input[2]);
            Student student = new Student(input[0], input[1], age, input[3]);
            listOfStudents.add(student);
            input = sc.nextLine().split("\\s+");
        }

        String cityName = sc.nextLine();
        for (Student student : listOfStudents){
            if(student.getHometown().equals(cityName)){
                System.out.println(student);
            }
        }
    }
}
