import java.util.Scanner;

public class CouncilOfElrondVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] votes = sc.nextLine().split(", ");
        int votedYes = 0;
        int votedNo = 0;
        int votedAbstain = 0;

        for (String vote : votes){
            if(vote.equals("Yes")){
                votedYes++;
            } else if (vote.equals("No")){
                votedNo++;
            } else {
                votedAbstain++;
            }
        }

        if(votedYes > votedNo){
            System.out.println("Yes");
        } else if(votedNo > votedYes){
            System.out.println("No");
        } else if (votedYes == votedNo && votedYes > 0){
            System.out.println("Tie");
        } else if (votedNo == 0 && votedYes == 0 && votedAbstain >= 0){
            System.out.println("Abstain");
        }
    }
}
