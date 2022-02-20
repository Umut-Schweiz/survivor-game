import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Survivor-Game");
        System.out.println("Enter your name before starting the game : ");
        String playerName = scan.nextLine();

        player = new Player(playerName);
        player.selectChar();
        start();
    }

    public void start() {
        while (true) {
            System.out.println("\n<<<====================>>\n");
            System.out.println("Please choose a location to continue:\n");
            System.out.println("1. Safe House --> This is your safe place, there are no enemies!");
            System.out.println("2. Cave --> You encounter zombies!");
            System.out.println("3. Forest --> You encounter vampires!");
            System.out.println("4. River --> You encounter bears!");
            System.out.println("5. Store --> You can buy weapon or armor");
            int selectLoc = scan.nextInt();
            while (selectLoc < 0 || selectLoc > 5) {
                System.out.println("Please select a valid location : ");
                selectLoc = scan.nextInt();
            }

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if(!location.getLocation()) {
                System.out.println("Game is over");
                break;
            }
        }
    }
}
