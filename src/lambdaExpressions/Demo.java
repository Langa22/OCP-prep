package lambdaExpressions;
interface funInter{
     void sum(int a,int b);
}
interface funInter2{
    int getValues(int a,int b);
}
public class Demo{
    public static void main(String[] args) {
        //Implementation of a functional interface using lambda expression
        funInter inter=(a,b)-> System.out.println("The sum is :"+(a+b));
        inter.sum(4,4);
        funInter2 inter2=(a,b)->a*b;
        System.out.println("Multiple of 4*4 is "+inter2.getValues(4,4));
    }
}
