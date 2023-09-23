package shooter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока слотов %d с оружием, " + " введите номер, " +
                "чтобы выстрелить, " + " -1 чтобы выйти: %n", player.getSlotsCount());
        while (true) {
            int slot = scanner.nextInt();
            if (slot > -1) {
                player.shotWithWeapon(slot);
            } else {
                System.out.println("Game over");
                break;
            }
        }
    }
}
