import java.util.Locale;

public abstract class BattleLocation extends Location {
    protected Obstacle obstacle;
    BattleLocation(Player player, String name, Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }

    public boolean getLocation() {
        int obsCount = obstacle.obstacleCount();
        System.out.println("You are in " + this.getName() );
        System.out.println("Be careful! There are " + obsCount + " " +  obstacle.getName() + "here");
        System.out.println("<B>attle or <F>light");
        String selectCase = scan.next();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("B")) {
            if (combat(obsCount)) {
                System.out.println("You have defeated all the enemies in" + this.getName() + "!");
                return true;
            }else {
                System.out.println("You are died");
                return false;
            }
        }

        return true;
    }

    public boolean combat(int obsCount) {
        for (int i =0; i < obsCount; i++) {
            playerStats();
            enemyStats();
        }
        return true;
    }

    public void playerStats() {
        System.out.println("Player stats : \n--------------");
        System.out.println("Health: " + player.getHealthy());
        System.out.println("Damage: " + player.getDamage());
        System.out.println("Money " + player.getMoney());

        if (player.getInv().getDamage() > 0 ) {
            System.out.println("Weapon: " + player.getInv().getWeaponName());
        }

        if (player.getInv().getArmor() > 0 ) {
            System.out.println("Armor: " + player.getInv().getArmorName());
        }
    }

    public void enemyStats() {
        System.out.println( "\n" + obstacle.getName() + " stats : \n--------------");
        System.out.println("Health: " + obstacle.getHealth());
        System.out.println("Damage: " + obstacle.getDamage());
        System.out.println("Award: " + obstacle.getAward());
    }

}
