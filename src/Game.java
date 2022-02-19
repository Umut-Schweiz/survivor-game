import java.util.Scanner;

public class Game {
    Player player;
    Location location;

    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Survivor-Game");
        System.out.println("Enter your name before starting the game : ");
        String playerName = scan.nextLine();

        player = new Player(playerName);
        player.selectChar();
    }
}
