package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test5 {
    public static void main(String[] args){
//        try(FileReader fr = new FileReader("C:/temp.txt")) {
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try(PrintWriter writer = null) {
            System.out.println("Hello");
        }
    }
}
