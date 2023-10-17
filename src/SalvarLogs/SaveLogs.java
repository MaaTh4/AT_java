package SalvarLogs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class SaveLogs {
    public static void SalvarLogs(String log, String nickname) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String Diretorio = "src/MainProgram/temp";
        System.out.println("Programa de Relatórios do Medieval Battle");
        System.out.println("Informe o nickname do jogador que deseja obter o relatório de partidas");
        String enterNickname = scanner.next();
        Path caminhoNickname = Paths.get(Diretorio + "/" + enterNickname + ".csv");
        if (Files.exists(caminhoNickname)){
            List<String> linhas = Files.readAllLines(caminhoNickname);
            int qtdPartidas = linhas.size();

            System.out.printf("%s %s\n", "Jogador", enterNickname);
            System.out.printf("%s %s\n", "Nickname:", enterNickname);
            System.out.printf("%s %d\n", "Patidas Jogadas:", qtdPartidas);
            System.out.printf("%s %s\n", "Heroi mais jogado:", Report.getMostUsedHero(linhas));
            System.out.printf("%s %s\n", "Monstro mais enfrentado:", Report.getMostFacedMonster(linhas));
            System.out.printf("%s %d\n", "Pontos De Batalha:", Report.getPoints(linhas));

        } else {
            System.out.println("Usuário não existe");
        }
    }
}


