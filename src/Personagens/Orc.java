package Personagens;

import Util.Dados;
import static Util.Dados.d8;

public class Orc implements PersonagensStats {
    String name = "Orc";
    int healthPoints = 20;
    int strength = 6;
    int defense = 2;
    int agility = 2;
    int dmgFactor = d8();

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


