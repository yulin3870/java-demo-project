package day01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class TestDate {
    public static void main(String[] args) throws Exception {
        Connection con = DBUtils.openConnection();
        PreparedStatement stmt = con.prepareStatement("select empno,"
                + "ename,hiredate from emp");

        ResultSet rs = stmt.executeQuery();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        while (rs.next()) {
            String date1 = rs.getString("hiredate");
            Date date = rs.getDate("hiredate");
            if (date != null) {
                String date2 = sdf.format(date);
                System.out.println(date1 + "," + date2);
            }

        }
        con.close();

        // PreparedStatement stmt
        // = con.prepareStatement("insert " +
        // "into emp (empno,ename,hiredate) " +
        // "values (?,?,?)");
        //
        // stmt.setInt(1, 9000);
        // stmt.setString(2, "大好人");
        // stmt.setDate(3, new Date(System.currentTimeMillis()));
        //
        // int n = stmt.executeUpdate();
        // System.out.println(n);

        con.close();
    }
}
