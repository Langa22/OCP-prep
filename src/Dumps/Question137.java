package Dumps;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question137 {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fis=new FileInputStream("C:/Users/Precision 7530/Documents/MyTxt/version.txt");
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);){
            if(br.markSupported()){
                System.out.print((char)br.read());
                br.mark(2);
                System.out.print((char)br.read());
                br.reset();
                System.out.print((char)br.read());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
