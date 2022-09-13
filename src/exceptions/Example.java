package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super{
    public void m1() throws IOException  {
        throw new FileNotFoundException();
//        try {
//            throw new IOException();
//            //System.out.println("Hi it is me!!!!");
//        }catch (FileNotFoundException e) {
//            throw e;
//        }
    }
}
public class Example extends Sub{
    public static void main(String[] args){
        try{
            //System.out.println("Hi!!!!!");
            Sub s=new Sub();
            s.m1();
        }catch (Exception ex){
            //System.out.println("Exception !!!");
            ex=null;
        }
    }
}
