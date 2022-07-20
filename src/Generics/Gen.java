package Generics;

public class Gen <T>{
    //T is our object it can be of any type based on our requirements
    T obj;
    Gen(T obj){
        this.obj=obj;
    }
    public void show(){
        System.out.println("The type of ob : "+obj.getClass().getName());
    }
    public T getObj() {
        return obj;
    }
}
class Test{
    public static void main(String[] args) {
       Gen<String>s=new Gen<>("Lunga");
        s.show();
        System.out.println(s.getObj());
    }
}