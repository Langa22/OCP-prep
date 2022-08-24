package Generics;

import java.util.ArrayList;
import java.util.List;

public class Question15 {
    public static void main(String[] args) {
        List<? super String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        //Error
//        for(String str : list) {
//            System.out.print(str);
//        }
    }
}
