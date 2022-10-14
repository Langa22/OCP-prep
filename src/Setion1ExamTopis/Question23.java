package Setion1ExamTopis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question23 {
    public static void main(String[] args) throws IOException {
        Path source= Paths.get("/data/december/log.txt");
        Path destination=Paths.get("/data");
        Files.copy(source,destination);
    }
}
