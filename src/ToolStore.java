
public class ToolStore extends NormalLocation {

    ToolStore(Player player) {
        super(player, "Store");
    }

    public boolean getLocation() {
        System.out.println("Money : " + player.getMoney());
        System.out.println("1. Weapons");
        System.out.println("2. Armors");
        System.out.println("3. Quit");
        System.out.println("Please choose : ");

        int selectTool = scan.nextInt();
        int selectItemID;

        switch (selectTool) {
            case 1:
                selectItemID =  weaponMenu();
                buyWeapon(selectItemID);
                break;
            case 2:

                break;
            default:
                break;
        }
        return true;
    }

    public int weaponMenu() {
        System.out.println("1. Gun \t <Money : 25> - <Damage : 2>");
        System.out.println("2. Sword \t <Money : 35> - <Damage : 3>");
        System.out.println("3. Rifle \t <Money : 45> - <Damage : 7>");
        System.out.println("4. Quit");
        System.out.println("Please choice your weapon");
        int selectWeaponID = scan.nextInt();
        return selectWeaponID;
    }

    public void buyWeapon (int itemID) {
        int damage = 0, price =0 ;
        String weaponName = null;

        switch (itemID) {
            case 1:
                damage = 2;
                weaponName = "Gun";
                price = 25;
                break;
            case 2:
                damage = 3;
                weaponName = "Sword";
                price = 35;
                break;
            case 3:
                damage = 7;
                weaponName = "Rifle";
                price = 45;
                break;
            default:
                System.out.println("Invalid operation !");
                break;
        }

        if (player.getMoney() > price) {
            player.getInv().setDamage(damage);
            player.getInv().setWeaponName(weaponName);
            player.setMoney(player.getMoney() - price);
            System.out.println("You bought a " + weaponName +", Previous damage : " + player.getDamage() + ", Currently new damage : " +
                    (player.getDamage() + player.getInv().getDamage()));
            System.out.println("Available balance : " + player.getMoney());
        }else {
            System.out.println("Your balance is insufficient please try again when you have enough balance");
        }




    }
}
