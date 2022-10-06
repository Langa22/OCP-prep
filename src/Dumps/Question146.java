package Dumps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Question146 {
    public static void main(String[] args) {
        Connection con=null;
        String username="root";
        String password="root";
        String dbURL="jdbc:mysql://localhost:3306/ocp";
        try{
            Properties prop=new Properties();
            prop.put("user",username);
            prop.put("password",password);
            con= DriverManager.getConnection(dbURL,prop);
            if(con!=null){
                System.out.println("Connection Established.");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
