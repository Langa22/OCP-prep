package Dumps;

import java.text.NumberFormat;
import java.util.Locale;

public class Question108 {
    public static void main(String[] args) {
        double d=15;
        Locale l=new Locale("en","US");
        NumberFormat format=NumberFormat.getCurrencyInstance(l);
        System.out.println(format.format(d));
    }
}
