package Generics;
class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

class A1<T> {
    T t;
    void set(T t) {
        this.t = t;
    }
    T get() {
        return t;
    }
}
public class Test6 {
    public static <T> void print1(A1<? extends Animal> obj) {
        //obj.set(new Dog()); //Line 22
        System.out.println(obj.get().getClass());
    }

    public static <T> void print2(A1<? super Dog> obj) {
        obj.set(new Dog()); //Line 27
        System.out.println(obj.get().getClass());
    }

    public static void main(String[] args) {
        A1<Dog> obj = new A1<>();
        print1(obj); //Line 33
        print2(obj); //Line 34
    }
}
