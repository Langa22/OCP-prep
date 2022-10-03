package Dumps;

import com.sun.xml.internal.bind.util.Which;

class FuelNotAvailException extends Exception { }
class Vehicle2 {
    protected void ride() throws Exception { //line n1
        System.out.println("Happy Journey!");
    }
}
class SolarVehicle extends Vehicle2 {
    public void ride() throws Exception { //line n2
        super.ride();
    }
}
public class Question63 {
    public static void main (String[] args) throws FuelNotAvailException, Exception
    {
        Vehicle2 v = new SolarVehicle ();
        v.ride();
    }

}
