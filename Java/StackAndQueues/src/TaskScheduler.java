import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        while(true){
            String[] inputTask = sc.nextLine().split("\\s+");
            // If the current line is an empty String break the loop.
            if(inputTask[0].trim().isEmpty()) break;
            if(inputTask[0].equals("getNextTask")){
                getNextTask(priorityQueue);
            } else {
                String currentTask = inputTask[2] + " - " + inputTask[1];
                priorityQueue.add(currentTask);
            }
        }

    }
    public static void getNextTask(PriorityQueue<String> queue){
        assert queue.peek() != null;
        String[] inputSplit = queue.peek().split("\\s+");
        String result = inputSplit[2] + " - " + inputSplit[0];
        System.out.println(result);
    }
}
