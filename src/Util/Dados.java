package Util;

import java.util.Random;
import Personagens.PersonagensStats;

public abstract class Dados {
    static Random random = new Random();

    public static int d2(){
        return random.nextInt(1,2);
    }
    public static int d4(){
        return random.nextInt(1,4);
    }
    public static int d6(){
        return random.nextInt(1,6);
    }
    public static int d8(){
        return random.nextInt(1,8);
    }
    public static int d10(){
        return random.nextInt(1,10);
    }

    public static int calcIniciativa(int agility){
        return agility + d10();
    }
}
