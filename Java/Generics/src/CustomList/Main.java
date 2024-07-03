package CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        CustomList<String> customList = new CustomList<String>();

      try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
          String input = reader.readLine();

            while (!input.equals(("end"))){
                String[] inputTokens = input.split("\\s+");

                switch (inputTokens[0]){
                    case "Add":
                        customList.add(inputTokens[1]);
                        break;
                    case "Remove":
                        customList.remove(Integer.parseInt(inputTokens[1]));
                        break;
                    case "Contains":
                        System.out.println(customList.contains(inputTokens[1]));
                        break;
                    case "Swap":
                        int firstIndex = Integer.parseInt(inputTokens[1]);
                        int secondIndex = Integer.parseInt(inputTokens[2]);
                        customList.swap(firstIndex, secondIndex);
                        break;
                    case "Greater":
                        System.out.println(customList.countGreaterThan(inputTokens[1]));
                        break;
                    case "Min":
                        System.out.println(customList.getMin());
                        break;
                    case "Max":
                        System.out.println(customList.getMax());
                        break;
                    case "Print":
                        customList.printArray();
                        break;
                    default:
                        throw new RuntimeException("Invalid input command.");
                }

                input = reader.readLine();
            }
      } catch (IOException e){
          throw new RuntimeException(e.getMessage());
      }
    }
}
