package Dumps;

import java.sql.*;

public class Question106 {
    public static void main(String[] args) throws SQLException {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
                String query = "SELECT * FROM Employee WHERE ID=111";
                Statement smt = conn.createStatement();
                ResultSet rs = smt.executeQuery(query);
                System.out.println("Employee ID: " + rs.getInt("ID"));
            }catch (Exception e){
               System.out.println("Error");
            }
    }
}
