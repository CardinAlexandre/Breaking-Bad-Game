package com.company;

import java.util.Random;
import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {
        American heisenberg = new American("Heisenberg", 500, 300, 100);
        American jesse = new American("Jesse", 1000, 100, 50);
        American flynn = new American("Flynn", 500, 50, 10);
        American hank = new American("Hank", 700, 200, 200);
        American skyler = new American("Skyler", 1000, 20, 20);
        American saul = new American("Saul Goodman", 1000, 80, 50);
        American mike = new American("Mike", 900, 300, 200);
        American gus = new American("Gus", 1000, 400, 300);
        Player[] american = {heisenberg, jesse, flynn, hank, skyler, saul, mike, gus};

        Mexican tuco = new Mexican("Tuco", 800, 300, 100);
        Mexican dawg = new Mexican("Dawg Paulson", 700, 100, 80);
        Mexican tortuga = new Mexican("Tortuga", 600, 200, 50);
        Mexican bobby = new Mexican("Bobby Kee", 500, 100, 50);
        Mexican cousins = new Mexican("The Cousins", 1200, 300, 300);
        Player[] mexican = {tuco, dawg, tortuga, bobby, cousins};

        System.out.println("             *_____________________________*                               ");
        System.out.println("             |                             |                               ");
        System.out.println("             |      ____             35    |                               ");
        System.out.println("             |     |  _ \\                  |                               ");
        System.out.println("             |     | |_| |                 |                               ");
        System.out.println("             |     |     /                 |                               ");
        System.out.println("             |     |----|     ___ ___      |                               ");
        System.out.println("             |     |  _  \\   |  |/ _|      |                               ");
        System.out.println("             |     | |_| |   |   /         |                               ");
        System.out.println("             |     |_____/   |__|          |                               ");
        System.out.println("             |                             |                               ");
        System.out.println("             *_____________________________*______________________________*");
        System.out.println("                                           |                              |");
        System.out.println("                                           |      ____              56    |");
        System.out.println("                                           |     |  _ \\                   |");
        System.out.println("                                           |     | |_| |                  |");
        System.out.println("                                           |     |     /                  |");
        System.out.println("                                           |     |----|      __  __       |");
        System.out.println("                                           |     |  _  \\    / _\\| |       |");
        System.out.println("                                           |     | |_| |   | (_|  |       |");
        System.out.println("                                           |     |_____/    \\__/|_|       |");
        System.out.println("                                           |                              |");
        System.out.println("                                           *______________________________*");
        System.out.println("");

        System.out.println("       __           __     _                                         _                        \n" +
                "       \\ \\        / /     | |                                       | |                       \n" +
                "        \\ \\  /\\  / / ___  | |   ___    ___    _ __ ___     ___      | |_    ___              \n" +
                "         \\ \\/  \\/ / / _ \\ | |  / __|  / _ \\  | '_ ` _ \\   / _ \\     | __|  / _ \\             \n" +
                "          \\  /\\  / |  __/ | | | (__  | (_) | | | | | | | |  __/     | |_  | (_) |            \n" +
                "           \\/  \\/   \\___| |_|  \\___|  \\___/  |_| |_| |_|  \\___|      \\__|  \\___/             \n" +
                "  _    _          _   _                             _           _       _                    \n" +
                " | |  | |        | | | |                           (_)         | |     | |                   \n" +
                " | |__| |   ___  | | | |   ___       _ __     ___   _    __ _  | |__   | |__     ___    _ __ \n" +
                " |  __  |  / _ \\ | | | |  / _ \\     | '_ \\   / _ \\ | |  / _` | | '_ \\  | '_ \\   / _ \\  | '__|\n" +
                " | |  | | |  __/ | | | | | (_) |    | | | | |  __/ | | | (_| | | | | | | |_) | | (_) | | |   \n" +
                " |_|  |_|  \\___| |_| |_|  \\___/     |_| |_|  \\___| |_|  \\__, | |_| |_| |_.__/   \\___/  |_|   \n" +
                "                                                         __/ |                               \n" +
                "                                                        |___/                                ");

        Player playerAmerican = playerChoice(american);
        Player playerMexican = botChoice(mexican);

        while (playerAmerican.getHealth() > 0 && playerMexican.getHealth() > 0){
            playerAmerican.weaponChoice(playerMexican, playerAmerican);
            playerMexican.weaponChoice(playerAmerican, playerMexican);
            playerAmerican.takeHit(playerMexican);
            checkKo(playerAmerican);
            playerMexican.takeHit(playerAmerican);
            checkKo(playerMexican);
        }
    }

    public static Player playerChoice(Player[] american){
        Scanner myAmerican = new Scanner(System.in);
        int chosenAmerican = 0;
        System.out.println("which American character you want ? : 1.Heisenberg, 2.Jesse, 3.Flynn, 4.Hank, 5.Skyler, " +
                "6.Saul Goodman, 7.Mike, 8.Gus");
        chosenAmerican = myAmerican.nextInt() - 1;
        System.out.println("");
        System.out.println("You choosed : " + american[chosenAmerican].getName() +
                "\n"
                + american[chosenAmerican].getHealth() + " life points " +
                "\n"
                + american[chosenAmerican].getAttack() + " of attack" +
                "\n"
                + american[chosenAmerican].getDefense() + " of defense.");
        return american[chosenAmerican];
    }

    public static Player botChoice(Player[] mexican){
        Random randomMexican = new Random();
        int chosenMexican = randomMexican.nextInt(5);
        System.out.println("");
        System.out.println("bot choosed : " + mexican[chosenMexican].getName() +
                "\n"
                + mexican[chosenMexican].getHealth() + " life points " +
                "\n"
                + mexican[chosenMexican].getAttack() + " of attack" +
                "\n"
                + mexican[chosenMexican].getDefense() + " of defense.");
        return mexican[chosenMexican];
    }

    public static void checkKo(Player player) {
        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " is KO !\n");
            System.out.println("  ______             _ \n" +
                    " |  ____|           | |\n" +
                    " | |__    _ __    __| |\n" +
                    " |  __|  | '_ \\  / _` |\n" +
                    " | |____ | | | || (_| |\n" +
                    " |______||_| |_| \\__,_|\n" +
                    "                       ");
        }
        else {
            System.out.println(player.getName() + " has " + player.getHealth() + " life points remaining !");
        }
    }
}
