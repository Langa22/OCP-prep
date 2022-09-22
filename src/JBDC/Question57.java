package JBDC;

import java.sql.*;
import java.util.Properties;

public class Question57 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "root");
        String query = "Select count(*) FROM LOG";
        try (Connection con = DriverManager.getConnection(url, prop);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query);)
        {
            System.out.println(rs.getInt(1));
        }
    }
}
