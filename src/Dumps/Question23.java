package Dumps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question23 {
    public static void main(String[] args) throws IOException {
        Path source= Paths.get("C:/Users/Precision 7530/Documents/example.txt");
        Path destination=Paths.get("C:/Users/Precision 7530/");
        Files.copy(source,destination);
    }
}
