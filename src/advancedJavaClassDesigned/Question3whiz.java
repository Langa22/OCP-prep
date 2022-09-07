package advancedJavaClassDesigned;
interface I{
    default boolean equal(Object O){
        return true;
    }
}
class A1 implements I{
    public boolean equals(Object O){
        return false;
    }
}
public class Question3whiz {
    public static void main(String[] args) {
        A1 a=new A1();
        I ia=new A1();
        I i=new I(){};
        System.out.println(a.equals(ia)+""+i.equals(ia));
    }
}
