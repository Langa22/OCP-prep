package Generics;
class A {}
interface M{}
interface N{}

class B extends A {}
class C extends A implements M {}
class D extends A implements M, N {}

class Generic<T extends A & M & N> {}

public class Test3 {
    public static void main(String[] args) {
        /*INSERT*/
        Generic<D>obj=new Generic<>();

    }
}