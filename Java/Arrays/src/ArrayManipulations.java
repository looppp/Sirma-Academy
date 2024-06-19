import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayOfNumbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] arrayOfCommands = sc.nextLine().split(", ");

        for (int i = 0; i < arrayOfCommands.length; i++) {
            String[] commandTokens = arrayOfCommands[i].split(" ");
            String command = commandTokens[0];
            int tempIndexCounter = 0;

            switch (command.toLowerCase()) {
                //add a number to the end of the array
                case "add":
                    int numberToAdd = Integer.parseInt(commandTokens[1]);
                    int[] tempArray = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length + 1);
                    tempArray[tempArray.length - 1] = numberToAdd;
                    arrayOfNumbers = tempArray;
                    break;

                //remove number from the array
                case "remove":
                    int numberToRemove = Integer.parseInt(commandTokens[1]);
                    int[] tempRemoveArray = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length - 1);
                    for (int j = 0; j < arrayOfNumbers.length; j++) {
                        if(arrayOfNumbers[j] != numberToRemove){
                            tempRemoveArray[tempIndexCounter++] = arrayOfNumbers[j];
                        }
                    }
                    arrayOfNumbers = tempRemoveArray;
                    tempIndexCounter = 0;
                    break;
                //removes number at a given index
                case "removeat":
                    int removeNumberIndex = Integer.parseInt(commandTokens[1]);
                    int[] tempRemoveAtArray = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length - 1);
                    for (int j = 0; j < arrayOfNumbers.length; j++) {
                        if(j != removeNumberIndex){
                            tempRemoveAtArray[tempIndexCounter++] = arrayOfNumbers[j];
                        }
                    }
                    arrayOfNumbers = tempRemoveAtArray;
                    tempIndexCounter = 0;
                    break;
                //inserts a number at a given index
                case "insert":
                    int addNumber = Integer.parseInt(commandTokens[1]);
                    int indexAt = Integer.parseInt(commandTokens[2]);
                    int[] tempAddAtIndex = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length + 1);

                    for (int j = 0; j <= arrayOfNumbers.length; j++) {
                        if(j == indexAt){
                            tempAddAtIndex[j] = addNumber;
                        } else if (j < indexAt){
                            tempAddAtIndex[j] = arrayOfNumbers[j];
                        } else {
                            tempAddAtIndex[j] = arrayOfNumbers[j - 1];
                        }
                    }
                    arrayOfNumbers = tempAddAtIndex;
                    break;
            }
        }

        for(int number : arrayOfNumbers) System.out.printf("%d ", number);
    }
}
