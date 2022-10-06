package Dumps;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question86 {
    public static void main(String[] args) {
        Path path1= Paths.get("/Software/././sys/readme.txt");
        //System.out.println(path1.getRoot());
        Path path2=path1.normalize();
        System.out.println(path2);
        Path path3=path2.relativize(path1);
        System.out.println(path3);
        System.out.print(path1.getNameCount());
        System.out.print(" : "+path2.getNameCount());
        System.out.print(" : "+path3.getNameCount());
    }
}
