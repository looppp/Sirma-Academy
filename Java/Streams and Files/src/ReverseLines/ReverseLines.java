package ReverseLines;

import java.io.*;

public class ReverseLines {
    public static void main(String[] args) {
        String inputFilePath = "src\\ReverseLines\\input.txt";
        String outputFilePath = "src\\ReverseLines\\output.txt";
        StringBuilder text = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            PrintWriter writer = new PrintWriter(outputFilePath)
        ){
            String inputLine = reader.readLine();

            while(inputLine != null){
                text.append(inputLine).reverse();
                writer.println(text);
                text.setLength(0);
                inputLine = reader.readLine();
            }

            System.out.println("Created new file output.txt");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
