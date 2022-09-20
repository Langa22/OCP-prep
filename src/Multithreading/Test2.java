package Multithreading;
class MyThread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Child thread");
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyThread2 t=new MyThread2();
        Thread thread=new Thread(t);
        thread.start();
        System.out.println("Main thread");
    }
}
