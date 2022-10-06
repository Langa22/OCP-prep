package Dumps;

import java.util.concurrent.*;

class R1 implements Runnable{
    public void run(){
        System.out.println("Run...");
    }
}
class C implements Callable<String>{
    public String call() throws Exception {return "call...";}
}
public class question113 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newSingleThreadExecutor();
        es.execute(new R1());
        Future<String>f1=es.submit(new C());
        System.out.println(f1.get());
        es.shutdown();
    }
}
