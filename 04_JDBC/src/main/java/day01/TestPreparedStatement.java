package day01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPreparedStatement {
    public static void main(String[] args) throws Exception {
        // 输入姓名
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输出名字:");
        String name = br.readLine();
        System.out.println(name);

        // 连接数据库执行查询
        Connection con = DBUtils.openConnection();

        //Statement stmt = con.createStatement();
        PreparedStatement stmt =
                con.prepareStatement("select empno,ename,sal from emp where ename=?");

        stmt.setString(1, name);

////		String sql = "select empno, ename, sal " 
////			  + "from emp " + "where ename='"+ name + "'";
//
//		System.out.println(sql);

//		ResultSet rs = stmt.executeQuery(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("empno") + "," + rs.getString("ename")
                    + "," + rs.getString("sal"));
        }

        con.close();
    }
}
