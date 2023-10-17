package Util;

import java.util.Scanner;
import java.util.Random;

import Jogadores.Computador;
import Jogadores.Player;
import Personagens.*;
public class Method {
    static Scanner scanner = new Scanner(System.in);
    public static String getNickname(){
        System.out.println("Digite seu nickname");
        String nickname = scanner.next();
        return nickname;
    }
    public static PersonagensStats getMonster(){
        Random random = new Random();
        int randomMonster = random.nextInt(2 + 1 );
        PersonagensStats monster = null;

        if(randomMonster == 1){
            return new MortoVivo();
        }
        else if (randomMonster == 2){
            return new Orc();
        }
        else if (randomMonster == 3) {
            return new Kobold();
        }
        return monster;
    }


    public static String getClasse(){
      System.out.println("Com classe você ira jogar?");
      System.out.println("Bárbaro, Guerreiro, Paladino");
      String classe = scanner.next();
      classe = classe.toLowerCase();
      return classe;
    }

    public static boolean verifyClasse(String _classe){
        String[] classes = {"guerreiro", "barbaro", "bárbaro", "paladino"};
        for (String classe: classes) {
            if(_classe.equals(classe)){
                return true;

            } else{
                return false;
            }
        }
        return false;
    }
    public static PersonagensStats getHero(String classe){
        PersonagensStats hero = null;
        if (classe.equals("guerreiro")){
            return new Guerreiro();
        } else if (classe.equals("barbaro") || classe.equals("bárbaro")) {
            return new Barbaro();
        }
        else if (classe.equals("paladino")){
            return new Paladino();
        }
        return hero;
    }

    public static boolean getWhoStarts(Player player, Computador computador){
        do {
            if (player.getIniciativa() > computador.getIniciativa()){
                return true;
            } else if (computador.getIniciativa() > player.getIniciativa()) {
                return false;
            }
        } while(player.getIniciativa() == computador.getIniciativa());
        return true;
    }

}

