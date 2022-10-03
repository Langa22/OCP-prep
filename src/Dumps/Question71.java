package Dumps;

import java.sql.*;

public class Question71 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/ocp", "root", "root");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            st.execute("SELECT*FROM Employee");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                if (rs.getInt(1) ==101) {
                    rs.updateString(2, "Jack");
                }
            }
            rs.absolute(2);
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        } catch (SQLException ex) {
            System.out.println("Exception is raised");
        }

    }
}
