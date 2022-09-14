package exceptions;

import java.sql.SQLException;

public class Test4 {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            //e = new SQLException();
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("Caught Successfully.");
        }
    }
}
