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
    private int strength;
    private int defense;

    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }

    public void attack(Character other) {
        int damage = this.strength - other.defense;
        if (damage > 0) {
            other.health -= damage;
            System.out.println(this.name + " menyerang " + other.name + " dan mengurangi " + damage + " poin kesehatan.");
        } else {
            System.out.println(this.name + " menyerang " + other.name + " tetapi tidak menyebabkan kerusakan.");
        }
    }

    public void status() {
        System.out.println("\nNama: " + this.name);
        System.out.println("Kesehatan: " + this.health);
        System.out.println("Kekuatan: " + this.strength);
        System.out.println("Pertahanan: " + this.defense);
    }

    public static void main(String[] args) {
        Character player = new Character("Naruto", 90,70, 60);
        Character enemy = new Character("Sasuke", 90, 50, 60);
        
        player.status();
        enemy.status();
        
        player.attack(enemy);
        enemy.attack(player);
        
        player.status();
        enemy.status();
    }
}
