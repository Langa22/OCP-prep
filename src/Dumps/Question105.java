package Dumps;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question105 {
    public static void main(String[] args) {
        //Path iP = new Paths("/First.txt");
        //Path iP = Paths.toPath ("/First.txt");
        //Path iP = new Path ("/First.txt");
        Path iP = Paths.get ("/", "First.txt");
        System.out.println(iP);
    }
}
