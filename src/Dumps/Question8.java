package Dumps;
abstract class Shape{
    Shape(){
        System.out.println("Shape");
    }
    protected void area(){
        System.out.println("Shape");
    }
}
class Square extends Shape{
    int side;
//    Square int side1{
//
//        /*insert code*/
//        this.side=side;
//    }
    public void area(){
        System.out.println("square");
    }
    class Rectangle extends Square{
        int len,br;
        Rectangle(int x,int y){
            /*insert code here*/
            super();
            super.side=x;
        }
        public void area(){
            System.out.println("Rectangle");
        }
    }
}
public class Question8 {

}
