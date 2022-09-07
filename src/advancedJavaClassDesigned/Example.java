package advancedJavaClassDesigned;
class inter{
    public void hello(){
        System.out.println("Hello");
    }
}
public class Example {
    public static void main(String[] args) {
        inter in=new inter(){
           public void hello(){
               System.out.println("Hi");
           }
        };
        in.hello();
    }
}
