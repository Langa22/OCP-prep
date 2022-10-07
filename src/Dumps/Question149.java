package Dumps;

import java.sql.*;

public class Question149 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp","root","root");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        st.execute("SELECT * FROM Stud");;
        ResultSet rs= st.getResultSet();
        rs.absolute(3);
        rs.moveToInsertRow();
        rs.updateInt(1,113);
        rs.updateString(2,"Jannet");
        rs.updateString(3,"jannet@uni.com");
        rs.updateRow();
        rs.refreshRow();
        System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
    }
}
