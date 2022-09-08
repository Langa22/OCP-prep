package advancedJavaClassDesigned;
class Outer7 {
    private static int i = 10;
    private int j = 20;

    static class Inner {
        void add() {
            //System.out.println(i + j);
        }
    }
}
public class Question60 {
    public static void main(String[] args) {
        Outer7.Inner inner = new Outer7.Inner();
        inner.add();
    }
}
