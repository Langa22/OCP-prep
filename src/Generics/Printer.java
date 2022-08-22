package Generics;

public class Printer<String> {
    private String t;
    Printer (String t){
        this.t=t;
    }
    //Error
    //public String toString(){
    //return null;
    //}
}
class Test2{
    public static void main(String[] args) {
        Printer<Integer>obj=new Printer<>(100);
        System.out.println(obj);
    }
}