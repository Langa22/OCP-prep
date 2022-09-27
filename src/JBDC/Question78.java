package JBDC;

import java.sql.*;

public class Question78 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "root";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ) {
            ResultSet res1 = stmt.executeQuery("SELECT * FROM EMPLOYEE ORDER BY ID");
            //ResultSet res2 = stmt.executeQuery("SELECT * FROM EMPLOYEE ORDER BY ID DESC");
            res1.next();
            System.out.println(res1.getInt(1));
            //res2.next();
            //System.out.println(res2.getInt(1));
        }
    }
}
