package Dumps;

import java.io.*;

public class Question157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("C:/Users/Precision 7530/Documents/MyTxt/data.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/Precision 7530/Documents/MyTxt/alldata.txt"));
        String line=null;
        while((line= br.readLine())!=null){
            bw.append(line+"\n");;
        }
        bw.flush();//line n1
    }
}
