package SalvarLogs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LogGenerator {
    public static void SaveLog(String log, String nickname) throws IOException {

        String Diretorio = "src/MedievalBattle";
        File file = new File(Diretorio);
        if (!file.exists()) {
            Files.createDirectory(Path.of(Diretorio));
        }

        Path CSV = Paths.get(Diretorio + "/" + nickname + ".csv");
        if (!Files.exists(CSV)) {
            Files.createFile(CSV);
        }

        List<String> linhas = Files.readAllLines(CSV);
        linhas.add(log);
        Files.write(CSV, linhas);
    }
}

