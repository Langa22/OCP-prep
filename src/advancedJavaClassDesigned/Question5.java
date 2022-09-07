package advancedJavaClassDesigned;
abstract class Animal {
    abstract void eat();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats biscuit.");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}
public class Question5 {
    public static void main(String[] args) {
        Animal [] animals = new Dog[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        animals[0].eat();
        animals[1].eat();
    }
}
