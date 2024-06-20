package CountLinesWordsAndCharacters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountLinesWordsAndCharacters {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String input = reader.readLine();
            while(input != null){
                String[] path = input.split("\\+");
                String[] tokens = path[3].split(".");
                input = reader.readLine();
                //TODO finish the logic!
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
