package Dumps;

import java.util.Optional;

class Employee2{
    Optional<Address2>address;
    Employee2(Optional<Address2>address){
        this.address=address;
    }

    public Optional<Address2> getAddress() {return address;}

}
class Address2{
    String city="New York";
    public String getCity(){return city;}
    public String toString(){return city;}
}
public class Question30 {
    public static void main(String[] args) {
        Address2 address2=null;
        Optional<Address2>adds2=Optional.ofNullable(address2);
        Employee2 e1=new Employee2(adds2);
        String eAddress=(adds2.isPresent())?adds2.get().getCity():"City not available";
    }
}
