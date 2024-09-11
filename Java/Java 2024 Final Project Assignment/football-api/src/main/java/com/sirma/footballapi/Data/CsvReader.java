package com.sirma.footballapi.Data;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.StringTemplate.STR;

@Slf4j
public class CsvReader {

    public static List<String[]> readCSV(String filePath){
        List<String[]> data = new ArrayList<>();
        String line ;

        try(InputStream inputStream = CsvReader.class.getClassLoader().getResourceAsStream(filePath);
                BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(inputStream)))){
           // Skip the headers
            line = reader.readLine();
            while ((line = reader.readLine()) != null){
                // Remove the extra spaces after the commas.
                String formatedLine = line.replaceAll(",\\s*", ",");
                data.add(formatedLine.split(","));
            }
        } catch (IOException e) {
            log.warn(STR."An error has occurred while trying to read the file: \{e.getMessage()}");
        }

        return data;
    }


}
