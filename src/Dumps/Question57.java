package Dumps;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
    CyclicBarrier cb;
    public Worker(CyclicBarrier cb) { this.cb = cb; }
    public void run () {
        try {
            cb.await();
            System.out.println("Worker…");
        } catch (Exception ex) { }
    }
}
class Master implements Runnable { //line n1
    public void run () {
        System.out.println("Master…");
    }
}
public class Question57 {
    public static void main(String[] args) {
        Master master = new Master();
        //line n2
        CyclicBarrier cb=new CyclicBarrier(1,master);
        Worker worker = new Worker(cb);
        worker.start();
    }
}
