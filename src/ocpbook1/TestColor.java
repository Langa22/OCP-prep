package ocpbook1;
 abstract class shape {
    public static class Color1 {
        int m_red, m_green, m_blue;
        public Color1() {
            this(0, 0, 0);
        }
        public Color1(int red, int green, int blue) {
            m_red = red;
            m_green = green;
            m_blue = blue;
        }
        public String toString() {
            return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
        }
    }
}
public class TestColor {
    public static void main(String[] args) {
        shape.Color1 white=new shape.Color1(255,255,255);
        System.out.println("White color has values:"+white);
    }
}
