package Generics;
//interface Operation{
//    int operate(int x,int y);
//}

//Wrong the types need to be cast to int
//interface Operation{
//    int operate(long x,long y);
//}

//Wrong operator = cannot be applied to object
//interface Operation<T>{
//    int operate(T x,T y);
//}

interface Operation<T extends Integer>{
    int operate(T x,T y);
}
public class Question21 {
    public static void main(String[] args) {
        Operation o1 = (x, y) -> x + y;
        System.out.println(o1.operate(5, 10));
    }

}
