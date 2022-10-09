package Dumps;

public class Question102 {
    double fuelLevel;
    public Question102(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void start(){
        assert fuelLevel<0:"Impossible fuel";//Line n1
        System.out.println("Started");
    }
    public void stop(){
        System.out.println("Stopped");
    }
    public static void main(String[] args) {
        Question102 question102=new Question102(10);
        question102.start();
    }
}
