package Dumps;

import java.sql.*;

public class Question53 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root");
        String query = "SELECT id FROM Employee";
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            stmt.executeQuery("SELECT id FROM log");
            while (rs.next()) {
                 //process the results
                System.out.println("Employee ID: "+ rs.getInt("id"));
                 }
             } catch (Exception e) {
             System.out.println ("Error");
        }

    }
}
