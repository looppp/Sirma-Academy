package CountUniqueWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class CountUniqueWords {
    public static void main(String[] args) {
        String filePath = "src\\CountUniqueWords\\input.txt";
        HashSet<String> uniqueSetOfWords = new HashSet<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String nextLine = reader.readLine();

            while (nextLine != null){
                String[] inputWords = nextLine.split("[\s.]+");
                uniqueSetOfWords.addAll(Arrays.asList(inputWords));
                nextLine = reader.readLine();
            }

            System.out.println(uniqueSetOfWords.size());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
