package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
  public Saxon(int health, int strength) {
    super(health, strength);
    this.setHealth(150);
    this.setStrength(strength);
  }

  private String msg;

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String receiveDamage(int damage) {
    this.health -= damage;
    if (this.getHealth() > 0) {
      this.msg = "A Saxon has received " + damage + " points of damage";
    } else {
      this.msg = "A Saxon has died in combat";
    }
    return this.msg;
  }
}
