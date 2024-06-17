package org.example.soldier;

public class Soldier {

   public int strength;
   public int health;

    public Soldier(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int attack() {
        return this.strength;
    }
   public String receiveDamage(int damage) {
        health=health-damage;
        //healt-=damage (es lo mismo)
       return null;
   }

}
