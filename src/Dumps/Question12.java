package Dumps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Question12 {
    public static void main(String[] args) throws IOException {
        Path file= Paths.get("C:/Users/Precision 7530/Documents/example.txt");
        Stream<String> fc= Files.lines(file);
        fc.forEach(s-> System.out.println(s));
    }
}
