package advancedJavaClassDesigned;

public class Question36 {
    private int num1 = 100;
    class N {
        private int num2 = 200;
    }

    public static void main(String[] args) {
        Question36 outer = new Question36();
        Question36.N inner = outer.new N();
        System.out.println(outer.num1 + inner.num2);
    }
}
