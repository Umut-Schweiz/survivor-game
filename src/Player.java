import java.util.Scanner;

public class Player {
    private int damage, healthy, money, realHealthy;
    private String name, charName;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
    }

    public void selectChar() {
        switch (charMenu()) {
            case 1:
                initPlayer("Samurai" , 5 , 21 , 15);
                break;
            case 2:
                initPlayer("Archer" , 7 , 18 , 20);
                break;
            case 3:
                initPlayer("Knight" , 8 , 24 , 5);
                break;
            default:
                initPlayer("Samurai" , 5 , 21 , 14);
        }
        System.out.println("Your character was created");
        System.out.println("Your character is " + getCharName() + "\tDamage:" + getDamage() + "\t Healthy:" + getHealthy() + "\t Money:" + getMoney());
    }

    public int charMenu() {
        System.out.println("Please select a character : ");
        System.out.println("1- Samurai,\t Damage : 5, Healty : 21, Money : 15");
        System.out.println("2- Archer, \t Damage : 7, Healty : 18, Money : 20");
        System.out.println("3- Knight, \t Damage : 8, Healty : 24, Money : 5");
        System.out.println("Enter the number of the character ID you choose");
        int charID = scan.nextInt();

        while (charID < 1 || charID > 3){
            System.out.println("Please enter a valid character ID");
            charID = scan.nextInt();
        }

        return charID;
    }

    public void initPlayer(String charName, int damage, int healthy, int money) {
        setCharName(charName);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
        setHealthy(healthy);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getRealHealthy() {
        return realHealthy;
    }

    public void setRealHealthy(int realHealthy) {
        this.realHealthy = realHealthy;
    }
}
