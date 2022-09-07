package advancedJavaClassDesigned;

public class Question17 {
    static int a = 10000;

    static {
        --a;
    }

    {
        ++a;
    }

    public static void main(String[] args) {
        System.out.println(a);
        new Question17();
    }
}
