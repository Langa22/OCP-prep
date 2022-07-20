package ocpbook1;

class Point{
    private int xPos,yPos;
    public Point(int x,int y){
        xPos=x;
        yPos=y;
    }
    public String toString() {
        return "x = "+xPos+" ,y = "+yPos;
    }
    int getX(){return xPos;}
    int getY(){return yPos;}
}
public final class ImmutableCircle {
    private final Point center;
    private final int radius;
    public ImmutableCircle(int x,int y,int r){
        center=new Point(x,y);
        radius=r;
    }
    public String toString(){
        return "center: "+center+" and radius = "+radius;
    }
    public int getRadius(){
        return radius;
    }
    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }
    public static void main(String[] args) {
        System.out.println(new ImmutableCircle(10,10,20));
    }
}
