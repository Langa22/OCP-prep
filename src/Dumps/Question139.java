package Dumps;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question139 {
    public static void main(String[] args) {
        Locale currentLocale;
        //currentLocale=new Locale.Builder().setLanguage("de").setRegion("DE").build();
        currentLocale=new Locale("de","DE");;
        ResourceBundle messages=ResourceBundle.getBundle("MessagesBundle",currentLocale);
        System.out.println(messages.getString("inquiry"));
    }
}
