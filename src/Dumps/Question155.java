package Dumps;

import java.io.IOException;

class Video{
    public void play()throws IOException{
        System.out.print("Video played.");
    }
}
class Game extends Video{
//    public void play()throws Exception{
//        super.play();
//        System.out.println("Game played.");
//    }
}
public class Question155 {
    public static void main(String[] args) {
        try{
            new Game().play();;
        }catch (Exception e){
            System.out.println(e.getClass());
        }
    }
}
