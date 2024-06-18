package org.example.soldier;

public class Soldier {

  private int strength;
  protected int health;

  public int getHealth() {
    return health;
  }

  public int setHealth(int i) {
    this.health = this.health;
    return 0;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = this.strength;
  }

  public Soldier(int health, int strength) {
    this.health = health;
    this.strength = strength;
  }

  public int attack() {
    return this.strength;
  }

  public String receiveDamage(int damage) {
    health = health - damage;
    // healt-=damage (es lo mismo)
    return null;
  }
}
