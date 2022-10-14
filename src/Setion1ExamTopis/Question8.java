package Setion1ExamTopis;

abstract class Shape {
    Shape() {
        System.out.println("Shape");
    }
    protected void area() {
        System.out.println("Shape");
    }
}
class Square extends Shape {
    int side;
    Square (int side){
        /* insert code here */
        this.side = side;

    }
    public void area() {System.out.println("Square");}
    }

class Rectangle extends Square {
    int len, br;

    Rectangle(int x, int y) {
        super(x);
        //super.side = x;/* insert code here */
        //len = x, br = y;
    }

    public void area() {
        System.out.println("Rectangle");
    }
}

public class Question8 {
}
