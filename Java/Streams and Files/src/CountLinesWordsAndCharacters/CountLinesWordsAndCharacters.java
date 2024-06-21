package CountLinesWordsAndCharacters;

import java.util.Scanner;

public class CountLinesWordsAndCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        int indexOfDot = filePath.lastIndexOf('.');
        int indexOfBackSlash = filePath.lastIndexOf('\\');

        if(indexOfDot == -1){
            System.out.println("The file doesn't have an extension");
        }

        String fileName = filePath.substring(indexOfBackSlash + 1, indexOfDot);
        String fileExtension = filePath.substring(indexOfDot + 1 );

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
        System.out.println("File size: {size} bytes");
    }
}
