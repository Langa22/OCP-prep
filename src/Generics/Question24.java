package Generics;

public class Question24 <T>{
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String args[]) {
        Question24 obj = new Question24();
        obj.set("OCP");
        obj.set(85);
        obj.set('%');

        System.out.println(obj.get());
    }

}
