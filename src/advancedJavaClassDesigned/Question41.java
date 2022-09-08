package advancedJavaClassDesigned;
class Outer2 {
    public void print(int x) {
        class Inner {
            public void getX() {
                //System.out.println(++x);
            }
        }
        Inner inner = new Inner();
        inner.getX();
    }
}
public class Question41 {
    public static void main(String[] args) {
        new Outer2().print(100);
    }
}
