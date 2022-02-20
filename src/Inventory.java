
public class Inventory {
    private boolean water, food, firewood;
    private String weaponName, armorName;
    private int damage, armor;

    Inventory() {
        this.water =false;
        this.food = false;
        this.firewood = false;
        this.damage = 0;
        this.armor = 0;
        this.weaponName = null;
        this.armorName = null;

    }

    public boolean isWater() {
        return water;
    }

    public boolean isFood() {
        return food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }


    public void setWater(boolean water) {
        this.water = water;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
