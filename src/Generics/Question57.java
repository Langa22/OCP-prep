package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point1 {
    private int x;
    private int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
public class Question57 {
    public static void main(String [] args) {
        List<Point1> points = new ArrayList<>();
        points.add(new Point1(4, 5));
        points.add(new Point1(6, 7));
        points.add(new Point1(2, 2));

//        Collections.sort(points, new Comparator<Point1>() {
//            public int compareTo(Point1 o1, Point1 o2) {
//                return o1.getX() - o2.getX();
//            }
//        });

        System.out.println(points);
    }
}
