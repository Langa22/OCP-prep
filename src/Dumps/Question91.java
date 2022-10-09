package Dumps;

import com.sun.xml.internal.bind.api.impl.NameConverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Question91 {
    public static void main(String[] args) {
        try{
            List<String>content= Files.readAllLines(Paths.get("C:/Users/Precision 7520/IdeaProjects/OCP-prep/src/Dumps/employee"));
            content.stream().forEach(line->{
                try{
                    Files.write(
                            Paths.get("allemp.txt"),
                            line.getBytes(),
                            StandardOpenOption.APPEND
                    );
                }catch (IOException e){System.out.println("Exception 1");}
            });
        }catch (IOException e){System.out.println("Exception 2");}
    }
}
