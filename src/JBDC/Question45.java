package JBDC;

import java.sql.*;

public class Question45 {
    public static void main(String[] args) throws SQLException {
        String query = "Select * FROM EMPLOYEE";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query);) {
            System.out.println(rs.getMetaData().getColumnCount()); //Line 11
        }

    }
}