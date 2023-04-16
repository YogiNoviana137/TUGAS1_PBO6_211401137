/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.character;

/**
 *
 * @author ASUS
 */

//Yogi Noviana 211401137
public class Character {
    private String name;
    private int health;
    private int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Character enemy) {
        int damageDealt = this.getDamage();
        enemy.takeDamage(damageDealt);
        System.out.println(this.getName() + " Serang " + enemy.getName() + " untuk " + damageDealt + " kerusakan!");
        if (!enemy.isAlive()) {
            System.out.println(enemy.getName() + " telah dikalahkan!");
        }
    }

    public static void main(String[] args) {
        Character player = new Character("Sasuke", 100, 20);
        Character enemy = new Character("Naruto", 50, 10);

        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }

        if (player.isAlive()) {
            System.out.println("Selamat! Anda mengalahkan musuh!");
        } else {
            System.out.println("Game berakhir. Anda telah dikalahkan!");
        }
    }
}
