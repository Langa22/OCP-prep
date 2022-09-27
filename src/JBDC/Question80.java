package JBDC;

import java.sql.*;

public class Question80 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root");
            String query = "Select * FROM EMPLOYEE";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) { //Line 12
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("First Name: " + rs.getString("FIRSTNAME"));
                System.out.println("Last Name: " + rs.getString("LASTNAME"));
                System.out.println("Salary: " + rs.getDouble("SALARY"));
            }
            rs.close(); //Line 18
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
