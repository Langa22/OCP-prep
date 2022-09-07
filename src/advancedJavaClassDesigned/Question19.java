package advancedJavaClassDesigned;
enum Flags {
    TRUE, FALSE;
    Flags() {
        System.out.println("HELLO");
    }
}
public class Question19 {
    public static void main(String[] args) {
        //Enums cannot be instantiated
        //Flags flags = new Flags();
    }
}
