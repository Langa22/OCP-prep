package Dumps;
class Book{
    int id;
    String name;
    public Book(int id,String name){
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj){
        boolean output=false;
        Book b=(Book)obj;
        if(this.id==(b.id)){
            output=true;
        }
        return output;
    }
}
public class Question17 {
    public static void main(String[] args) {
        Book b1=new Book(101,"Java programming");
        Book b2=new Book(101,"Java programming");
        System.out.println(b1.equals(b2));
    }
}
