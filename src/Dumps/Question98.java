package Dumps;
enum Course{
    JAVA(100),J2ME(150);
    private int cost;
    Course(int c){
        this.cost=c;
    }
    int getCost(){
        return cost;
    }
}
public class Question98 {
    public static void main(String[] args) {
        for(Course a:Course.values()){
            System.out.println(a+" fees "+a.getCost()+" ");
        }
    }
}
