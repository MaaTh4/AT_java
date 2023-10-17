package Personagens;

import Util.Dados;
import static Util.Dados.d4;

    public class Guerreiro implements PersonagensStats {
        String name = "Guerreiro";
        int healthPoints = 12;
        int strength = 4;
        int defense = 3;
        int agility = 3;
        int dmgFactor = d4() + d4();

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


