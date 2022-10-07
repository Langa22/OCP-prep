package Dumps;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question147 {
    public void loadResourceBundle(){
        ResourceBundle resource=ResourceBundle.getBundle("Greetings", Locale.US);
        //System.out.println(resource.getObject(1));
    };
    public static void main(String[] args) {
        new Question147().loadResourceBundle();
    }
}
