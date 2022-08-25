package Generics;

import java.util.ArrayList;

class Main<T extends Number>{}
class Sub extends Main{}
class Sub1 extends Main{}
class Main2{}
public class Example2 {
    public static void m1(ArrayList<? extends Main>l){

    }

    public static void m2(ArrayList<? super Sub>l){

    }
    public static void main(String[] args) {
        ArrayList<Sub>subs=new ArrayList<>();
        ArrayList<Sub1>sub=new ArrayList<>();
        ArrayList<Main>main=new ArrayList<>();
        m1(subs);
        m1(sub);
        m1(main);
        //m1(Main2);
        m2(subs);
        m2(main);
        //m2(sub);
    }

}
