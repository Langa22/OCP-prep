package advancedJavaClassDesigned;
class Player1 {
    String name;
    int age;

    Player1() {
        this.name = "Yuvraj";
        this.age = 36;
    }
    //We cannot override to string method using protected
//    protected String toString() {
//        return name + ", " + age;
//    }
}
public class Question7 {
    public static void main(String[] args) {
        System.out.println(new Player1());
    }
}
