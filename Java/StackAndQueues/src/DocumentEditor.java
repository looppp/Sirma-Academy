import java.util.ArrayDeque;
import java.util.Scanner;

public class DocumentEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stackOfDocuments = new ArrayDeque<>();
        ArrayDeque<String> redoStack = new ArrayDeque<>();
        String inputString = sc.nextLine();

        label:
        while(true){
            switch (inputString) {
                case "End":
                    break label;
                case "Undo()":
                    if(stackOfDocuments.isEmpty()){
                        System.out.println("Nothing to Undo.");
                    } else{
                        redoStack.push(stackOfDocuments.pop());
                        printElements(stackOfDocuments);
                    }
                    break;
                case "Redo()":
                    if(redoStack.isEmpty()){
                        System.out.println("Nothing to Redo.");
                    } else{
                        stackOfDocuments.push(redoStack.pop());
                        printElements(stackOfDocuments);
                    }
                    break;
                default:
                    String[] inputStringArray = inputString.split("\"");
                    stackOfDocuments.push(inputStringArray[1]);
                    printElements(stackOfDocuments);
                    break;
            }
            inputString = sc.nextLine();
        }
    }
    public static void printElements(ArrayDeque<String> stack){
        stack.reversed().forEach(System.out::print);
        System.out.println();
    }
}
