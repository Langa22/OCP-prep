package JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question65 {
    public static void main(String[] args)throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "root";
        String query = "DELETE FROM MESSAGES";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement())
        {
            System.out.println(stmt.execute(query));
        }

    }
}
