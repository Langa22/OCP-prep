package Dumps;
abstract class Operator{
    //protected void turnON();
    //protected void turnOFF();
}
class EngineOperator extends Operator{
    public final void turnON(){System.out.println("ON ");}
    public final void turnOFF(){System.out.println("OFF ");}
}
public class Question10 {
    Operator m=new EngineOperator();
    public void operate(){
        //m.turnON();
        //m.turnOFF();
    }
}
