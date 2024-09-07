package com.sirma.footballapi.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class CsvReader {

    public static List<String[]> readCSV(String filePath){
        List<String[]> data = new ArrayList<>();
        String line;

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while ((line = reader.readLine()) != null){
                // Remove the extra spaces after the commas.
                String formatedLine = line.replaceAll(",\\s*", ",");
                data.add(formatedLine.split(","));
            }
        } catch (IOException e) {
            System.out.println(STR."An error has occurred while trying to read the file: \\{e.getMessage()}");
        }

        return data;
    }


}
