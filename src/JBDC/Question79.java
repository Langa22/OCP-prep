package JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question79 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "root");)
        {
            connection = con;
        }
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(101, 'John', 'Smith', 12000)");
        stmt.close();
        connection.close();
    }
}
