package ocpbook1;

public class Counter {
    //For us to get the number of instances we need t declare the cont as static.
    //private int count;
    private static int count;
    public Counter(){
        count++;
    }
    public static void printCount(){
        System.out.println("Number of instances created so far is : "+count);
    }

    public static void main(String[] args) {
        Counter anInstance=new Counter();
        Counter.printCount();
        Counter anotherInstance=new Counter();
        Counter.printCount();
    }
}
