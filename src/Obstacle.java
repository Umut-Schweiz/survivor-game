import java.util.Random;

public class Obstacle {
    private String name;
    private int damage, award, health, maxObstacleNumber;


    public Obstacle(String name, int damage, int award, int health, int maxObstacleNumber) {
        this.name = name;
        this.damage = damage;
        this.award = award;
        this.health = health;
        this.maxObstacleNumber = maxObstacleNumber;
    }

    public int obstacleCount() {
        Random r = new Random();
        return r.nextInt(this.maxObstacleNumber) + 1;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAward() {
        return award;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxObstacleNumber() {
        return maxObstacleNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxObstacleNumber(int maxObstacleNumber) {
        this.maxObstacleNumber = maxObstacleNumber;
    }
}
