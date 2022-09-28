package Dumps;

public class Question34<T> {
    private T t;
    public T get(){
        return t;
    }
    public void set(T t){
        this.t=t;
    }
    public static void main(String[] args) {
        Question34<String>type=new Question34<>();
        Question34 type1=new Question34();
        type.set("Java");
        type1.set(100);
        System.out.println(type.get()+" "+type1.get());
    }
}
