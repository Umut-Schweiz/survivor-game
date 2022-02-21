
public abstract class BattleLocation extends Location {
    protected Obstacle obstacle;
    protected String award;

    BattleLocation(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
        this.award = award;
    }
    public boolean getLocation() {
        int obsCount = obstacle.obstacleCount();
        System.out.println("You are in " + this.getName() );
        System.out.println("Be careful! There are " + obsCount + " " +  obstacle.getName() + " here");
        System.out.println("<B>attle or <F>light");
        String selectCase = scan.nextLine();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("B")) {
            if (combat(obsCount)) {
                System.out.println("You have defeated all the enemies in" + this.getName() + "!");
                if (this.award.equals("Food") && player.getInv().isFood() == false) {
                    System.out.println("You won " + this.award );
                    player.getInv().setFood(true);
                }else if (this.award.equals("Water") && player.getInv().isWater() == false ) {
                    System.out.println("You won " + this.award );
                    player.getInv().setWater(true);
                }else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false ) {
                    System.out.println("You won " + this.award );
                    player.getInv().setFirewood(true);
                }
                return true;
            }
            if (player.getHealthy() <= 0) {
                System.out.println("You are died");
                return false;
            }
        }
        return true;
    }
    public boolean combat(int obsCount) {
        for (int i =0; i < obsCount; i++) {
            int defaultObstacleHealth = obstacle.getHealth();
            playerStats();
            enemyStats();
            while (player.getHealthy() > 0 && obstacle.getHealth() > 0) {
                System.out.println("<H>it or <R>un");
                String selectCase = scan.nextLine();
                selectCase = selectCase.toUpperCase();

                if (selectCase.equals("H")) {
                    System.out.println("You hit the enemy !");
                    obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
                    afterHit();
                    if (obstacle.getHealth() <= 0) {
                        System.out.println("Obstacle hit you");
                        player.setHealthy(player.getHealthy() - (obstacle.getDamage() -player.getInv().getArmor()));
                        afterHit();
                    }

                }else {
                    return false;
                }
            }
            if (obstacle.getHealth() < player.getHealthy()) {
                System.out.println("You defeat enemies !");
                player.setMoney(player.getMoney() + obstacle.getAward());
                System.out.println("Your current money: " + player.getMoney());
                obstacle.setHealth(defaultObstacleHealth);
            }else {
                return false;
            }
            System.out.println("----------------------------------");

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
    public void afterHit() {
        System.out.println("Player health: " + player.getHealthy());
        System.out.println(obstacle.getName() + " health: " + obstacle.getHealth() + "\n");
    }
}
