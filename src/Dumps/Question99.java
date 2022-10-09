package Dumps;
class Resource implements AutoCloseable{
    public void close() throws Exception {
        System.out.println("Close-");
    }
    public void open(){
        System.out.println("Open-");
    }
}
public class Question99 {
    public static void main(String[] args) {
        Resource res1=new Resource();
        try{
            res1.open();
            res1.close();
        }catch(Exception e){
            System.out.println("Exception-1");
        }
//        try(res1=new Resource()){
//            res1.open();
//        }catch(Exception e){
//            System.out.println("Exception-2");
//        }
    }
}
