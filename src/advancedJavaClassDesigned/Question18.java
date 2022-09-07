package advancedJavaClassDesigned;


public class Question18 {
    enum Directions {
        NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");

        private String notation;

        Directions(String notation) {
            this.notation = notation;
        }

        public String getNotation() {
            return notation;
        }
        }

    public static void main(String[] args) {
        System.out.println(Question18.Directions.NORTH.getNotation());
    }

}
