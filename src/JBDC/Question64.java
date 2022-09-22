package JBDC;

import java.sql.SQLException;

public class Question64 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "password";
        String query = "DELETE FROM MESSAGES";
//        try (Connection con = new Connection(url, user, password);
//             Statement stmt = con.createStatement())
//        {
//            System.out.println(stmt.executeUpdate(query));
//        }
    }
}
