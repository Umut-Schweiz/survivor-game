
public abstract class BattleLocation extends Location {
    protected Obstacle obstacle;
    BattleLocation(Player player, String name, Obstacle obstacle) {
        super(player);
        this.name = name;
        this.obstacle = obstacle;
    }

    public boolean getLocation() {
        int obsCount = obstacle.obstacleCount();
        return true;
    }

}
