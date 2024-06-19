import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RohanCavalryFormation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cavalryFormation = new java.util.ArrayList<>(Arrays.stream(sc.nextLine().split(", ")).toList());

        String[] commands = sc.nextLine().split(" ");

        while(!commands[0].equals("end")){
            switch (commands[0]){
                case "destroy":
                    int removeIndex = Integer.parseInt(commands[1]);
                    if(removeIndex < cavalryFormation.size()  && removeIndex >= 0){
                        cavalryFormation.remove(removeIndex);
                        System.out.println(String.join(" ", cavalryFormation));
                    }
                    break;
                case "swap":
                    int riderIndexOne = Integer.parseInt(commands[1]);
                    int riderIndexTwo = Integer.parseInt(commands[2]);
                    if(riderIndexOne >= 0 && riderIndexTwo <= cavalryFormation.size() - 1 && riderIndexTwo != riderIndexOne){
                        Collections.swap(cavalryFormation, riderIndexOne, riderIndexTwo);
                        System.out.println(String.join(" ", cavalryFormation));
                    }
                    break;
                case "add":
                    String elementToAdd = commands[1];
                    cavalryFormation.add(elementToAdd);
                    System.out.println(String.join(" ", cavalryFormation));
                    break;
                case "insert":
                    String insertId = commands[1];
                    int insertIndex = Integer.parseInt(commands[2]);
                    if(insertIndex >= 0 && insertIndex <= cavalryFormation.size()){
                        cavalryFormation.add(insertIndex, insertId);
                        System.out.println(String.join(" ", cavalryFormation));
                    }
                    break;
                case "center":
                    if(cavalryFormation.size() % 2 == 0){
                        int startIndex = (cavalryFormation.size() / 2) - 1;
                        int endIndex = (cavalryFormation.size() / 2) ;
                        System.out.print(cavalryFormation.get(startIndex) + " ");
                        System.out.print(cavalryFormation.get(endIndex));
                    } else {
                        System.out.println(cavalryFormation.get(cavalryFormation.size() / 2));
                    }
                    break;
            }
            commands = sc.nextLine().split(" ");
        }
    }
}
