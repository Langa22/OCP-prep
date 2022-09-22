package JBDC;

import java.sql.*;
import java.util.Properties;

public class Question54 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "root");
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE ORDER BY ID";

        try (Connection con = DriverManager.getConnection(url, prop);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(query);) {
            rs.relative(1);
            System.out.println(rs.getString(2));
        }
    }
}
