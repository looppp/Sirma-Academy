package ReplaceWord;

import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) {
        String fileInput = "src\\ReplaceWord\\input.txt";
        String fileOutput = "src\\ReplaceWord\\output.txt";

        String result = "";
        String wordToChange = "";
        String replacementWord = "";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileInput));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutput))){

            String input = reader.readLine();

            while (input != null){
                if(input.contains("->")){
                    String[] tokens = input.split("\\s+");
                    wordToChange = tokens[0];
                    replacementWord = tokens[2];
                } else {
                    result = input;
                    result = result.replaceAll(wordToChange, replacementWord);
                }
                input = reader.readLine();
            }

            writer.write(result);
            System.out.println("output.txt has been created.");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
