package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestInsert {
    public static void main(String[] args) throws Exception {
        Connection con = DBUtils.openConnection();

        PreparedStatement stmt = con.prepareStatement("insert into "
                + "emp(empno, ename) values (?,?)");

        for (int i = 10; i <= 20; i++) {
            stmt.setInt(1, i);
            stmt.setString(2, "name" + i);
            int n = stmt.executeUpdate();
            System.out.println("i=" + i + ":" + n);
        }

        con.close();

    }
}
