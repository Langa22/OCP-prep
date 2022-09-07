package advancedJavaClassDesigned;

public class Question27 {
    enum TrafficLight {
        //Enum constant list must be the first item in an enum.
        //GREEN("go"), AMBER("slow"), RED("stop");
        //should be the first line inside TrafficLight enum.
        GREEN("go"), AMBER("slow"), RED("stop");
        private String message;
        TrafficLight(String message) {
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
    }
    public static void main(String[] args) {
        System.out.println(TrafficLight.AMBER.getMessage().toUpperCase());
    }
}
