package Multithreading;


class MyThread1 extends Thread{
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Me");
        }
    }
    public void run(int number){
        for (int i = 0; i < 4; i++) {
            System.out.println("Them");
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        MyThread1 t2=new MyThread1();
        t2.start();
        //t2.run(2);
    }
}
