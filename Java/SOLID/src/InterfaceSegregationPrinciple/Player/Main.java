package InterfaceSegregationPrinciple.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.next();
        player.pause();
        player.shuffle();
        player.previous();
    }
}
