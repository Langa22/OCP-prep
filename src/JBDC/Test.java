package JBDC;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root");
            String query = "Select * FROM employee";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("First Name: " + rs.getString("FIRSTNAME"));
                System.out.println("Last Name: " + rs.getString("LASTNAME"));
                System.out.println("Salary: " + rs.getDouble("SALARY"));
                System.out.println();
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("An Error Occurred!");
        }
    }
}
