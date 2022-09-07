package advancedJavaClassDesigned;

public class Question1 {
    static int i=10;
    public class Inner{
//       public static void print(){
//            System.out.println(i);
//       }
    }
    public static void main(String[] args) {
        Inner in=new Question1().new Inner();
        //in.print();
    }
}
