import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class OrthancArchivesSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] orthancRecords = sc.nextLine().split(", ");
        String specificRecord = sc.nextLine();
        int firstOccurence = -1;
        int lastOccurence = -1;

        for (int i = 0; i < orthancRecords.length; i++) {
            if(orthancRecords[i].equals(specificRecord)){
                lastOccurence = i;
                if(firstOccurence < 0){
                    firstOccurence = i;
                }
            }
        }
        if(firstOccurence == -1 && lastOccurence == -1){
            System.out.println("Record not found");
        } else {
            System.out.println("First Occurrence: " + firstOccurence);
            System.out.println("Last Occurrence: " + lastOccurence);
        }

    }
}
