
public class SafeHouse extends NormalLocation {

    SafeHouse(Player player) {
        super(player, "Safe House");
    }

    public  boolean getLocation() {
        player.setHealthy(player.getRealHealthy());
        System.out.println("Your health is completely filled");
        System.out.println("You are now in Safe House");
        return true;
    }
}
