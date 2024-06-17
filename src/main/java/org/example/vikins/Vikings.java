package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public Vikings(String name, int health, int strength) {
        super(health, strength);
        this.name = name;
        this.msg = msg;
    }
    public String name;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String receiveDamage(int damage) {
       this.health -= damage;
        if (this.health > 0) {
            this.msg = this.name + " has received " + damage + " points of damage";
        } else {
           this.msg = this.name + " has died in act of combat";
        }
        return this.msg;
    }

    public String battleCry() {

        return "Odin Owns You All!";
    }

}
