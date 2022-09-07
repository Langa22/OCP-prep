package advancedJavaClassDesigned;
class Outer {
    private String name = "James Gosling";
    //Insert inner class definition here
    class Inner{
        public void printName(){
            System.out.println(name);
        }
    }
}
public class Question30 {
    public static void main(String[] args) {
        new Outer().new Inner().printName();
    }
}
