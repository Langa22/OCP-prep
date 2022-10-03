package Dumps;

import java.io.IOException;

final class Folder implements AutoCloseable{
    public void close()throws IOException{
        System.out.print("Close");
    }
    public void open(){
        System.out.print("Open ");
    }
}
public class Question51 {
    public static void main (String [] args) throws Exception {
        try (Folder f = new Folder()) {
            f.open();
        }
    }

}
