package WordLengths;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLengths {
    public static void main(String[] args) {
        String inputFile = "src\\WordLengths\\input.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = reader.readLine()) != null){
                String[] words = line.split("\\s+");
                for (String word : words){
                    if(result.length() > 0){
                        result.append(", ");
                    }
                    result.append(word.length());
                }
            }
            System.out.println(result);

        } catch (IOException e) {
            System.err.println("Error reading this file: " + e.getMessage());
        }
    }
}
