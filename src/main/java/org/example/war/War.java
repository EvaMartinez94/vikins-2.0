package org.example.war;

import java.util.ArrayList;
import java.util.Random;
import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

public class War {

  private ArrayList<Saxon> saxonArmy;
  private ArrayList<Vikings> vikingArmy;
  private Random random = new Random();

  public ArrayList<Saxon> getSaxonArmy() {
    return saxonArmy;
  }

  public void setSaxonArmy(ArrayList<Saxon> saxonArmy) {
    this.saxonArmy = saxonArmy;
  }

  public ArrayList<Vikings> getVikingArmy() {
    return vikingArmy;
  }

  public void setVikingArmy(ArrayList<Vikings> vikingArmy) {
    this.vikingArmy = vikingArmy;
  }

  public Random getRandom() {
    return random;
  }

  public void setRandom(Random random) {
    this.random = random;
  }

  public War() {
    this.vikingArmy = new ArrayList<Vikings>();
    this.saxonArmy = new ArrayList<Saxon>();
  }

  public void addViking(Vikings vikings) {
    this.vikingArmy.add(vikings);
  }

  public void addSaxon(Saxon saxon) {
    this.saxonArmy.add(saxon);
  }

  public String vikingAttack() {
    Vikings oneRandomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));
    Saxon oneRandomSaxon = saxonArmy.get(random.nextInt(saxonArmy.size()));
    int newDamage = oneRandomViking.getStrength();
    oneRandomSaxon.receiveDamage(newDamage);

    if (oneRandomSaxon.getHealth() <= 0) {
      saxonArmy.remove(oneRandomSaxon);
      return "A Saxon has died in combat";
    }

    return "";
  }

  public String saxonAttack() {
    Vikings oneRandomViking = vikingArmy.get(random.nextInt(vikingArmy.size()));
    Saxon oneRandomSaxon = saxonArmy.get(random.nextInt(saxonArmy.size()));
    int newDamage = oneRandomSaxon.getStrength();
    oneRandomViking.receiveDamage(newDamage);

    if (oneRandomViking.getHealth() <= 0) {
      vikingArmy.remove(oneRandomViking);
      return oneRandomViking.getName() + " has died in act of combat";
    }
    return oneRandomViking.getName()
        + "has received"
        + oneRandomSaxon.getStrength()
        + "points of damage";
  }
}
