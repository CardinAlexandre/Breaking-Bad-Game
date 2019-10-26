package com.company;

import java.util.Scanner;

public class American extends Player{

    public American(String name, int health, int attack, int defense) {
        super(name,health,attack,defense);
    }

    public void weaponChoice(Player player, Player opponent){
        Scanner myWeapon = new Scanner(System.in);
        int chosenWeapon = 0;
        System.out.println("");
        System.out.println("which attack you want to use ? : 1.Bomb 2.Meth 3.Car 4.Gun");
        chosenWeapon = myWeapon.nextInt() - 1;
        System.out.println("");
        if(chosenWeapon == 0){
            System.out.println(this.getName() + " : It's dangerous to play with fire, but smart choice 💣");
            this.setAttack((int) ((this.getAttack() + 200) - (opponent.getDefense())));
        }
        else if(chosenWeapon == 1){
            System.out.println(this.getName() + " : Please never touch this shit or you'll end next to a gutter 💎");
            this.setAttack((int) ((this.getAttack() + 50) - (opponent.getDefense())));
        }
        else if(chosenWeapon == 2){
            System.out.println(this.getName() + " : I like to ride too, but please don't use a Bentley for this 🚗");
            this.setAttack((int) ((this.getAttack() + 100) - (opponent.getDefense())));
        }
        else if(chosenWeapon == 3) {
            System.out.println(this.getName() + " : Hasta la vista baby 🔫");
            this.setAttack((int) ((this.getAttack() + 300) - (opponent.getDefense())));
        }
    }

    public void takeHit(Player opponent){
        this.setHealth((this.getHealth() - (opponent.getAttack())));
        System.out.println("");
        System.out.println(this.getName() + " did " + this.getAttack() + " damage.");
        System.out.println(opponent.getName() + " did " + opponent.getAttack() + " damage.");
        System.out.println("");
    }
}
