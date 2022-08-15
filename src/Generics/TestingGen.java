package Generics;

import java.util.ArrayList;

class Test1<T extends Runnable> { }
class MyThread1 extends Thread { }
class MyThread2 implements Runnable {
    public void run(){}
}
public class TestingGen {
    public static void main(String[] args) {
        Test1<Runnable> t1 = new Test1<Runnable>();
        Test1<MyThread1> t2 = new Test1<MyThread1>();
        Test1<MyThread2> t3 = new Test1<MyThread2>();
    }
    public static void m1(ArrayList<?>al){
        //al.add("A");
        al.add(null);
        //al.add(10);
    }
    public static void m2(ArrayList<? extends Number>al){
        //al.add(10);

    }
}
