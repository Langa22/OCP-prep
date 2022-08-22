package Generics;

class Printer1<T extends String> {}
public class Test4{
    public static void main(String[] args) {
        Printer1<String>printer=new Printer1<>();
        System.out.println(printer);
    }
}
//implements cannot be used at class level
//class Printer1<T implements Cloneable> {}
//public class Test4{
//    public static void main(String[] args) {
//        Printer1<String>printer=new Printer1<>();
//        System.out.println(printer);
//    }
//}