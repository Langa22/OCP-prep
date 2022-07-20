package Generics;
import java.util.ArrayList;
public class TestEg1 {
    public static void main(String[] args) {
        //Type Safety example.
        String[] arr = new String[4];
        arr[0] = "L";
        arr[1]="L";
        //arr[2]=new Integer(2); error because is an integer

        //Type casting example.
        ArrayList l=new ArrayList<>();
        l.add("L");
        l.add("M");
        l.add(new Integer(10));
        //String name1=l.get(0); error because there is no casting.
        String name2=(String)l.get(1);
        //String name3=(String)l.get(2); error because is an integer cannot be converted to string.

        //To eliminate these above errors we need Generics.
        //example
        ArrayList<String>s=new ArrayList<String>();
        s.add("L");
        s.add("H");
        s.add("Y");
        String name=s.get(0);

    }
}