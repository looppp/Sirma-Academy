package CharacterFrequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String fileInput = "src\\CharacterFrequency\\input.txt";
        LinkedHashMap<Character, Integer> charactersFrequencies = new LinkedHashMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileInput))){
            String line = reader.readLine();
            while(line != null){
                String input = line;
                for (char c : input.toCharArray()) {
                    if(charactersFrequencies.containsKey(c)){
                       charactersFrequencies.put(c, charactersFrequencies.get(c) + 1);
                    } else {
                        charactersFrequencies.put(c, 1);
                    }
                }
                line = reader.readLine();
            }
        for (var character : charactersFrequencies.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
