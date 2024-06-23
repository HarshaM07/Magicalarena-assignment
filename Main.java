package com.swiggy.assignment;

import java.util.Random;

class Player {
    int health;
    int strength;
    int attack;
    static Random random = new Random(); // Make Random static to initialize it only once

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    int getHealth() {
        return health;
    }


	int attack() {		
		int resp=random.nextInt(6)+1;
		return resp; // 6-sided die Roll    
	}

	int defend() {
		
		int resp=random.nextInt(6)+1;
		return resp; // 6-sided die Roll
	}

    void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) health = 0; // Ensure health does not go below zero
    }

    boolean isAlive() {
        return health > 0;
    }
}

class MagicalArena {
    Player playerA;
    Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    void fight() {
        Player attacker = playerA.health < playerB.health ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            int attackRoll = attacker.attack();
            int defenseRoll = defender.defend();

            int damage = (attackRoll * attacker.attack) - (defenseRoll * defender.strength);
            if (damage > 0) {
                defender.reduceHealth(damage);
            } else {
                damage = 0; // Ensure no negative damage
            }
          System.out.println(attacker == playerA ? "Player A" : "Player B" + " attacks with roll: " + attackRoll);
          System.out.println(defender == playerA ? "Player A" : "Player B" + " defends with roll: " + defenseRoll);
          System.out.println("Damage: " + damage);
          System.out.println("Player A Health: " + playerA.getHealth());
          System.out.println("Player B Health: " + playerB.getHealth());

            // Swap roles for the next round
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (!playerA.isAlive() && !playerB.isAlive()) {
        	System.out.println("It's a draw");
        } else if(playerA.isAlive()) {
        	System.out.println("Player A wins!");
        }else {
            System.out.println("Player B wins!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();
    }
}
