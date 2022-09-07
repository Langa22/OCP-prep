package advancedJavaClassDesigned;
enum Flags2 {
    TRUE;

    Flags2() {
        System.out.println("HELLO");
    }
}
public class Question22 {
    public static void main(String[] args) {
        Flags2 f1 = Flags2.TRUE;
        Flags2 f2 = Flags2.TRUE;
        Flags2 f3 = Flags2.TRUE;
    }

}
