package Dumps;
interface P{public void method1();}
interface Q extends P{public void method1();}
interface R extends P{public void method2();}
interface S{public default void method1(){}}
interface T{public void method1();public void method2();}
interface U{public void method1();public abstract void method2();}
public class Question131 {
    public static void main(String[] args) {
        P p=()-> System.out.println();
        Q q=()-> System.out.println();

//        R r=()-> System.out.println();
//        S s=()-> System.out.println();
//        T t=()-> System.out.println();
//        U u=()-> System.out.println();
    }
}
