package shooter;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[5];
        weaponSlots[0] = new Gun();
        weaponSlots[1] = new WaterGun();
        weaponSlots[2] = new SubMachineGun();
        weaponSlots[3] = new SlingShot();
        weaponSlots[4] = new RPG();
    }
    public int getSlotsCount() {
        return weaponSlots.length;
    }
    public void shotWithWeapon(int slot) {
        if (slot >= weaponSlots.length) {
            System.out.printf("Слот с номером № %s не существует" + "\n", slot);
            return;
        } else {
            System.out.printf("Выстрел из слота № %s" + "\n", slot);
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
