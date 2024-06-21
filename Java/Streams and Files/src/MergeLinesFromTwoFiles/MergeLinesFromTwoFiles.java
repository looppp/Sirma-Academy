package MergeLinesFromTwoFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeLinesFromTwoFiles {
    public static void main(String[] args) {
       String firstFilePath = "src\\MergeLinesFromTwoFiles\\input1.txt";
       String secondFilePath = "src\\MergeLinesFromTwoFiles\\input2.txt";
       String outputPath = "src\\MergeLinesFromTwoFiles\\output.txt";

       try(BufferedReader readerOne = new BufferedReader(new FileReader(firstFilePath));
           BufferedReader readerTwo = new BufferedReader(new FileReader(secondFilePath));
           PrintWriter writer = new PrintWriter(outputPath);){
           String inputLineOne = readerOne.readLine();
           String inputLineTwo = readerTwo.readLine();

           while(inputLineOne != null || inputLineTwo != null){
               writer.println(inputLineOne);
               writer.println(inputLineTwo);

               inputLineOne = readerOne.readLine();
               inputLineTwo = readerTwo.readLine();
           }

           System.out.println("Created file output.txt");

       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
