package Dumps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Question96 {
    public static void main(String[] args) {
        String userName="root";
        String passWord="root";
        String dbURL="jdbc:mysql://localhost:3306/mydb";
        try{
            Properties prop=new Properties();
            prop.put("user",userName);
            prop.put("password",passWord);
            Connection conn= DriverManager.getConnection(dbURL,prop);
            if(conn!=null){
                System.out.print("Connection Established");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
