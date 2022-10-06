package Dumps;

import java.util.function.Predicate;

interface LengthValidator{
    public boolean checkLength(String str);
}
public class Question110 {
    public static void main(String[] args) {
        boolean res=new LengthValidator(){
            public boolean checkLength(String str){
                return str.length()>5&&str.length()<10;
            }
        }.checkLength("Hello");

        Predicate<String> p=(s)->s.length()>5&&s.length()<10;
        p.test("Hello");
    }
}
