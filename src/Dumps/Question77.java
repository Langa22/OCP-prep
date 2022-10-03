package Dumps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question77 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:/Users/Precision 7530/Documents/MyTxt/green.txt");
        Path target = Paths.get("C:/Users/Precision 7530/Documents/MyTxt/colors/yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
    }
}
