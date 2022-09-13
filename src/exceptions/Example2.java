package exceptions;

public class Example2 {
    public static void main(String[] args) {
        int number =5;
        try{
            System.out.println(number/0);
            System.out.println(number/2);
        }catch (ArithmeticException e){
            System.out.println(number/0);
            System.out.println(number+2);
        }finally{
            try{
                number=number/0;
            }catch (ArithmeticException e){
                System.out.println("Again");
            }
        }
    }
}
