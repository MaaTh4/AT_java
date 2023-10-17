
import Util.Ataques;
import Util.Method;
import Personagens.PersonagensStats;
import Jogadores.*;



import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

            System.out.println("Seja bem vindo ao MedievalBattle");
            String nickname = Method.getNickname();
            String classe;
            String result;
            do {
                classe = Method.getClasse();
            } while (Method.verifyClasse(classe));
            PersonagensStats hero = Method.getHero(classe);
            PersonagensStats monster = Method.getMonster();

            Player player = new Player(hero, nickname);
            Computador computador = new Computador(monster);

            boolean getFirstAttack = Method.getWhoStarts(player, computador);

            if (getFirstAttack) {
                System.out.println(player.getNickname() + " jogando com o " + player.getName() + " começará atacando");
                Ataques.PlayerAttack(player, computador);
            } else {
                System.out.println("O " + computador.getName() + " começará atacando");
                Ataques.MachineAttack(player, computador);
            }
            if (player.isWinner()) {
                System.out.println("VOCÊ VENCEU!");
                result = "Venceu";
            } else {
                System.out.println("VOCÊ PERDEU");
                result = "Perdeu";
            }

            LocalDate localDate = LocalDate.now();
            String data = localDate.getDayOfMonth() + "/" + localDate.getMonthValue() + "/" + localDate.getYear();
            String log = data + ";" + player.getName() + ";" + result + ";" + computador.getName() + ";" + Ataques.getNumRound();


    }
  }
