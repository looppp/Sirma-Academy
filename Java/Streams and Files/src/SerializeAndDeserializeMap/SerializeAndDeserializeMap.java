package SerializeAndDeserializeMap;

import java.io.*;
import java.util.LinkedHashMap;

public class SerializeAndDeserializeMap {
    public static void main(String[] args) {
        String outputFile = "src\\SerializeAndDeserializeMap\\map.ser";
        LinkedHashMap<String, Integer> cities = new LinkedHashMap<>(){{
            put("New York", 8175133);
            put("Los Angeles", 3792621);
            put("Chicago", 2695598);
            put("Houston", 2129784);
            put("Phoenix", 1445632);
        }};

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFile))){
            outputStream.writeObject(cities);
            System.out.println("Map.ser is successfully created");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFile))){
            LinkedHashMap<String, Integer> loadedCitiesFromFile = inputStream.readObject(outputFile);
            System.out.println("Has been deserialized");
            //TODO Finish logic and Reading the file

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
