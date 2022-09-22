package JBDC;

import java.sql.*;

public class Question60 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "root";
        String query = "DELETE FROM MESSAGES";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             //To issue INSERT, UPDATE or DELETE statements either use
             //stmt.execute(String) method OR stmt.executeUpdate(String) method.
             ResultSet rs = stmt.executeQuery(query);)
        {
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}
