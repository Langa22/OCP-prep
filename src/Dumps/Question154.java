package Dumps;

import java.sql.*;

public class Question154 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root");
        Statement stmt = con.createStatement();
        String query = "delete from student WHERE id=103";;
        System.out.println("Status: "+ stmt.execute(query));
    }
}
