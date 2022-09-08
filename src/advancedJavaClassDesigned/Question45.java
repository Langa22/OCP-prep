package advancedJavaClassDesigned;
class Outer5 {
    private String msg = "A";
    public void print() {
        final String msg = "B";
        class Inner {
            public void print() {
                //System.out.println(this.msg);
            }
        }
        Inner obj = new Inner();
        obj.print();
    }
}
public class Question45 {
    public static void main(String[] args) {
        new Outer5().print();
    }
}
