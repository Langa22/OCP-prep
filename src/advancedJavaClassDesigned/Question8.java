package advancedJavaClassDesigned;
class Player2 {
    String name;
    int age;

    Player2() {
        this.name = "Sachin";
        this.age = 44;
    }
    //class Player doesn't override it correctly,
    //return type should be String and not Object.
//    public Object toString() {
//        return name + ", " + age;
//    }
}
public class Question8 {
    public static void main(String[] args) {
        System.out.println(new Player2());
    }
}
