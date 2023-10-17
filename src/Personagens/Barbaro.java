package Personagens;

import Util.Dados;

import static Util.Dados.d6;

public class Barbaro implements PersonagensStats {
        String name = "Barbaro";
        int healthPoints = 13;
        int strength = 6;
        int defense = 1;
        int agility = 3;
        int dmgFactor = d6() + d6();

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

