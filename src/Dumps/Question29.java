package Dumps;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question29 {
    static Connection newConnection=null;
    static Connection getBDConnection()throws SQLException{
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root")){
            newConnection=con;
        }
        return newConnection;
    }

    public static void main(String[] args) throws SQLException {
        getBDConnection();
        Statement st=newConnection.createStatement();
        st.executeUpdate("INSERT INTO student VALUES(102,'kELVIN')");
    }
}
