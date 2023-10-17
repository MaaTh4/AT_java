package Personagens;

import Util.Dados;
import static Util.Dados.d2;

public class Kobold implements PersonagensStats {
    String name = "Kobold";
    int healthPoints = 25;
    int strength = 4;
    int defense = 0;
    int agility = 1;
    int dmgFactor = d2() + d2() + d2();

    public int getDmgFactor(){
        return dmgFactor;
    }

    public int getHealthPoints(){
        return healthPoints;
    }


    public int getAgility(){
        return agility;
    }


    public int getStrength(){
        return strength;
    }


    public String getName(){
        return name;
    }


    public int getDefense(){
        return defense;
    }


    public int getDamage(){
        return dmgFactor;
    }


    public void setHealth(int health){
        healthPoints = health;
    }


    public int getHealth(){
        return healthPoints;
    }
}


