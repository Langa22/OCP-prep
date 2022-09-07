package advancedJavaClassDesigned;
class Player {
    String name;
    int age;
    Player() {
        this.name = "Virat";
        this.age = 29;
    }
    public int hashcode() {
        return 100;
    }
}
public class Question2 {
    public static void main(String[] args) {
        System.out.println(new Player());
    }
}
