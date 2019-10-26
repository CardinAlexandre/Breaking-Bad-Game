package com.company;

import java.util.Random;

public class Mexican extends Player {
    public Mexican(String name, int health, int attack, int defense) {
        super(name,health,attack,defense);
    }
    public void weaponChoice(Player player, Player opponent){
        Random randomMexicanWeapon = new Random();
        int chosenWeapon = randomMexicanWeapon.nextInt(3);
        if(chosenWeapon == 0){
            System.out.println(this.getName() + " : There is a bomb in the room, but it's not you 💣");
            this.setAttack((int) ((this.getAttack() + 200) - (opponent.getDefense())));
        }
        else if(chosenWeapon == 1){
            System.out.println(this.getName() + " : Try it ounce buddy, it's magic ! 💎");
            this.setAttack((int) ((this.getAttack() + 50) - (opponent.getDefense())));
        }
        else if(chosenWeapon == 2){
            System.out.println(this.getName() + " : 🎵 I'm gonna ride this horse to the hold town road 🎵 🚗");
            this.setAttack((int) ((this.getAttack() + 100) - (opponent.getDefense())));
        }
        else if(chosenWeapon == 3) {
            System.out.println(this.getName() + " : Love is a loaded pistol and it shoots to kill. " +
                    "But this time it's not love 🔫");
            this.setAttack((int) ((this.getAttack() + 300) - (opponent.getDefense())));
        }
    }

    public void takeHit(Player opponent){
        this.setHealth((this.getHealth() - (opponent.getAttack())));
    }
}
