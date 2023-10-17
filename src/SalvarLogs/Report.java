package SalvarLogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Report {
    static List<String> heroes = new ArrayList<>();
    static int guerreiroQuantidade = 0;
    static int paladinoQuantidade = 0;
    static int barbaroQuantidade = 0;

    public static  String getMostUsedHero(List<String> list){
        for(int i = 0; i < list.size(); i++){
            String linhaHeroi = list.get(i).split(";")[1];
            heroes.add(linhaHeroi);
        }
        heroes.forEach(hero ->{
            if (Objects.equals(hero, "Guerreiro")){
                guerreiroQuantidade++;
            }
            else if (Objects.equals(hero, "Paladino")){
                paladinoQuantidade++;
            }
            else if (Objects.equals(hero, "Barbaro")){
                barbaroQuantidade++;
            }
        });
        if (barbaroQuantidade > paladinoQuantidade && barbaroQuantidade > guerreiroQuantidade){
            return "Barbaro";
        } else if (paladinoQuantidade > barbaroQuantidade && paladinoQuantidade > guerreiroQuantidade){
            return "Paladino";
        } else if (guerreiroQuantidade > barbaroQuantidade && guerreiroQuantidade > paladinoQuantidade){
            return  "Guerreiro";
        }
        return null;
    }
    public static String getMostFacedMonster(List<String> list){
        String mostFacedMonster = null;
        int maximo = 0;
        for (String linha : list){
            String hero = linha.split(";")[3];
            int times = 0;
            for (String linha2 :
                    list) {
                String hero2 = linha2.split(";")[3];
                if (hero.equals(hero2)){
                    times++;
                }
            }
            if (times > maximo){
                maximo = times;
                mostFacedMonster = hero;
            }
        };
        return mostFacedMonster;
    }
    public static int getPoints(List<String> list){
        List<Integer> linhasRodadas = new ArrayList<Integer>();
        list.forEach(linha -> {
            linhasRodadas.add(Integer.parseInt(linha.split(";")[4]));
        });
        int numRounds = linhasRodadas.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return (list.size() * 100) - numRounds;
    }
}
