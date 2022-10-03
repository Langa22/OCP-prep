package Dumps;

import java.util.concurrent.*;

class CallerThread implements Callable<String> {
    String str;
    public CallerThread(String s) {this.str=s;}
    public String call() throws Exception {
        return str.concat("Call");
    }
}

public class Question73 {
    public static void main (String[] args) throws InterruptedException,
            ExecutionException
    {
        ExecutorService es = Executors.newFixedThreadPool(4); //line n1
        Future f1 = es.submit (new CallerThread("Call"));
        String str = f1.get().toString();
        System.out.println(str);
        //es.shutdown();
    }

}
