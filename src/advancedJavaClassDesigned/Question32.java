package advancedJavaClassDesigned;
class A2 {
    private String str = "Hello";
    public class B {
        public B(String s) {
            if(s != null)
                str = s;
        }
        public void m1() {
            System.out.println(str);
        }
    }
}
public class Question32 {
    public static void main(String[] args) {
        new A2().new B(null).m1();
    }
}
