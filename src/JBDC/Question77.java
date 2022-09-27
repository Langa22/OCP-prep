package JBDC;

import java.sql.*;

public class Question77 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "root";
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE ORDER BY ID";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ) {
            ResultSet rs = stmt.executeQuery(query);
            rs.relative(-3);
            rs.relative(1);
            System.out.println(rs.getInt(1));
        }
    }
}
