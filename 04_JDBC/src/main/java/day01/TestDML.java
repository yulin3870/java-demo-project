package day01;

import java.sql.Connection;
import java.sql.Statement;

public class TestDML {
    public static void main(String[] args) throws Exception {
        Connection con = DBUtils.openConnection();

        Statement stmt = con.createStatement();
        // 可以执行insert,delete和update等DML语句
        // 返回的整数表示,刚才的语句所影响的行数
        String sql = "update emp set sal=sal*120/100";
        // String sql = "delete from emp where ename='java'";
        //String sql = "insert into emp(empno,ename,sal,deptno) values(9999,'Java',3500,30)";
        int n = stmt.executeUpdate(sql);
        System.out.println(n);

        con.close();

    }
}
