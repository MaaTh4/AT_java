package Jogadores;

import Personagens.PersonagensStats;
import Util.Dados;
public class Player {
    PersonagensStats classe;
    String nickname;

    public Player(PersonagensStats classe, String nickname){
        this.classe = classe;
        this.nickname = nickname;
    }

    public int getHealth(){
        return classe.getHealth();
    }

    public String getName(){
        return classe.getName();
    }

    public String getNickname(){
        return nickname;
    }
    public int getAttack(){
        return Dados.d10() + classe.getAgility() + classe.getStrength();
    }

    public int getDamage(){
        return classe.getDamage();
    }

    public int getDefense(){
        return Dados.d10() + classe.getAgility() + classe.getDefense();
    }

    public void setHealth(int health2){
        classe.setHealth(health2);
    }

    public int getIniciativa(){
        return Dados.calcIniciativa(classe.getAgility());
    }

    boolean winner;

    public boolean isWinner(){
        return winner;
    }
    public void setWinner(boolean winner){
        this.winner = winner;
    }


}
