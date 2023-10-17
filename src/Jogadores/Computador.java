package Jogadores;

import Personagens.PersonagensStats;
import Util.Dados;
public class Computador {
    PersonagensStats computador;
    public Computador(PersonagensStats classe){
        computador = classe;
    }

    public int getHealth(){
        return computador.getHealth();
    }

    public String getName(){
        return computador.getName();
    }

    public int getAgility(){
        return computador.getAgility();
    }
    public int getAttack(){
        return Dados.d10() + computador.getAgility() +computador.getStrength();
    }

    public int getDamage(){
        return computador.getDamage();
    }

    public int getDefense(){
        return Dados.d10() + computador.getAgility() +computador.getDefense();
    }

    public void setHealth(int health2){
        computador.setHealth(health2);
    }

    public int getIniciativa(){
       return Dados.calcIniciativa(computador.getAgility());
    }
}
