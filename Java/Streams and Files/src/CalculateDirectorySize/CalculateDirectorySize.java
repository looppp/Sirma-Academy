package CalculateDirectorySize;

import java.io.File;

public class CalculateDirectorySize {
    public static void main(String[] args) {
        String filePath = "src\\CalculateDirectorySize";

        File directory = new File(filePath);
        long totalSize = calculateDirectorySize(directory);
        System.out.println("Total size: " + totalSize + " bytes");
    }

    private static long calculateDirectorySize(File directory) {
        long totalSize = 0;

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    totalSize += file.length();
                } else if (file.isDirectory()) {
                    totalSize += calculateDirectorySize(file);
                }
            }
        }

        return totalSize;
    }
}
