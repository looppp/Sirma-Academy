package CopyFileContent;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) {
        String filePath = "src\\CopyFileContent\\input.txt";
        String outputFilePath = "src\\CopyFileContent\\output.txt";

        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFilePath));
        ){
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);

            while(bytesRead != -1){
                outputStream.write(buffer, 0, bytesRead);
                bytesRead = inputStream.read(buffer);
            }

            System.out.println("File copied successfully!");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
