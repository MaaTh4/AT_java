package Util;

import Jogadores.*;
public class Ataques {
    static int rounds = 0;
    public static void PlayerAttack(Player player, Computador computador){
        System.out.println("Turno do player: " + player.getNickname());
        if(player.getAttack() > computador.getDefense()){
            System.out.println("O jogador " + player.getNickname() + " atacou");
            System.out.println("O ataque foi bem-sucedido");
            computador.setHealth(computador.getHealth() - player.getDamage());
            System.out.println("O " + computador.getName() + " perdeu " + player.getDamage() + " pontos de vida");
            System.out.println(("A vida do " + computador.getName() + " é de: " + computador.getHealth() + " pontos de vida"));
            System.out.println();
            if(computador.getHealth() <= 0){
                System.out.println("O " + computador.getName() + " morreu");
                System.out.print(player.getNickname() + " é o VENCEDOR!!");
                player.setWinner(true);
            }
            else  {
            MachineAttack(player, computador);
            }
        }
        else{
            System.out.println(computador.getName() + " defendeu");
            System.out.println("O " + computador.getName()+ " não tomou nenhum dano");
            System.out.println();
            MachineAttack(player, computador);
        }
        rounds ++;
    }

    public static void MachineAttack(Player player, Computador computador){
        System.out.println("Turno do computador");
        if (computador.getAttack() > player.getDefense()){
            System.out.println("O " + computador.getName() + " atacou");
            System.out.println("O ataque foi bem-sucedido");
            player.setHealth(player.getHealth() - computador.getDamage());
            System.out.println("O player " + player.getNickname() + " perdeu " + computador.getDamage() + " pontos de vida");
            System.out.println("A vida do player " + player.getNickname() + " é de: " + player.getHealth() + " pontos de vida");
            System.out.println();
            if(player.getHealth() <= 0){
                System.out.println("O jogador " + player.getNickname() + " morreu");
                System.out.println("O " + computador.getName() + " é o VENCEDOR!!");
                player.setWinner(false);
            } else {
                PlayerAttack(player, computador);
            }
        }
        else{
            System.out.println(player.getNickname() + " defendeu");
            System.out.println("O player " + player.getNickname()+ " não tomou nenhum dano");
            System.out.println();
            PlayerAttack(player, computador);
        }
        rounds ++;
    }
    public static int getNumRound(){
        return rounds;
    }
}
