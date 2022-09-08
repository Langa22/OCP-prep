package advancedJavaClassDesigned;
class Outer6 {
    abstract static class Animal { //Line 2
        abstract void eat();
    }

    static class Dog extends Animal { //Line 6
        void eat() { //Line 7
            System.out.println("Dog eats biscuits");
        }
    }
}
public class Question59 {
    public static void main(String[] args) {
        Outer6.Animal animal = new Outer6.Dog(); //Line 15
        animal.eat();
    }
}
