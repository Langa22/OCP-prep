package JBDC;

import java.sql.*;

public class Question52 {
    public static void main(String[] args)throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "root";
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE ORDER BY ID";
        try (
                Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery(query);) {
//            rs.moveToInsertRow();
//            rs.updateInt(1, 104);
//            rs.updateString(2, "Natasha");
//            rs.updateString(3, "Williams");
//            rs.updateDouble(4, 15500);
//            rs.insertRow();
          rs.absolute(5);
          rs.deleteRow();
        }
    }
}