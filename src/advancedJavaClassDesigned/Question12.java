package advancedJavaClassDesigned;
class Player3 {
    String name;
    int age;

    Player3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }

    public boolean equals(Player3 player) {
        if(player != null && this.name.equals(player.name)
                && this.age == player.age) {
            return true;
        }
        return false;
    }
}
public class Question12 {
    public static void main(String[] args) {
        Object p1 = new Player3("Sachin", 44);
        Object p2 = new Player3("Sachin", 44);
        System.out.println(p1.equals(p2));
    }
}
