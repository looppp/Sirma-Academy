package OpenClosedPrinciple.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private String fileName;

    public FileLogger (String fileName){
        this.fileName = fileName;
    }
    @Override
    public void log(String message) {
        try(FileWriter writer = new FileWriter(fileName, true)){
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
