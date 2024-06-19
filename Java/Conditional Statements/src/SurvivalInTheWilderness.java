import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String environment = sc.nextLine();
        String item = sc.nextLine();
        String output = "";

        switch (day){
            case "day":
                if(environment.equals("forest")){
                    if(item.equals("knive")){
                        output = "Hunt for food.";
                    } else if(item.equals("container")){
                        output = "Collect berries";
                    } else {
                        output = "Explore.";
                    }
                }
                if(environment.equals("desert")){
                    if(item.equals("hat")){
                    output = "Search for water.";
                    } else {
                        output = "Find shade";
                    }
                 }
                break;
            case "night":
                if(environment.equals("forest")) {
                    if (item.equals("firestarter")) {
                        output = "Make a campfire.";
                    } else {
                        output = "Climb a tree for safety.";
                    }
                }
                if(environment.equals("desert")){
                    if(item.equals("blanket")){
                        output = "Sleep";
                    } else {
                        output = "Keep mooving to stay warm.";
                    }
                }
        }

        if(output.isEmpty()){
            output = "Invalid input!";
        }
        System.out.println(output);

    }
}
