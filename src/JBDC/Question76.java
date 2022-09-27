package JBDC;

import java.sql.*;

public class Question76 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "root";
        String query = "Select ID, MESSAGE FROM LOG";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ) {
            stmt.executeUpdate("INSERT INTO LOG VALUES(1001, 'Login Successful')");
            stmt.executeUpdate("INSERT INTO LOG VALUES(1002, 'Login Failure')");

            con.setAutoCommit(true);

            stmt.executeUpdate("INSERT INTO LOG VALUES(1003, 'Not Authorized')");
        }
    }
}
