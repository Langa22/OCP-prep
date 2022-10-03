package Dumps;

import java.sql.*;

public class Question56 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root");
            String query = "Select * FROM Item WHERE ID = 110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
             while(rs.next()) {
                 System.out.println("ID: " + rs.getInt("Id"));
                 System.out.println("Name: " + rs.getString("Name"));
                }
            } catch (SQLException se) {
            System.out.println("Error");
        }
    }
}
