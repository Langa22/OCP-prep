package advancedJavaClassDesigned;
public class Question58 {
    private static class B {
        private void log() {
            System.out.println("static nested class");
        }
    }

    public static void main(String[] args) {
        /*INSERT*/
        B obj=new B();
        obj.log();
    }
}


