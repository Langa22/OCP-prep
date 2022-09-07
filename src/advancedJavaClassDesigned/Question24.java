package advancedJavaClassDesigned;

public class Question24 {
    enum TrafficLight {
        RED, YELLOW, GREEN;
    }

    public static void main(String[] args) {
        TrafficLight tl = TrafficLight.valueOf(args[0]);
        switch(tl) {
            case RED:
                System.out.println("STOP");
                break;
            case YELLOW:
                System.out.println("SLOW");
                break;
            case GREEN:
                System.out.println("GO");
                break;
        }
    }
}
