package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws Exception {
        /* 装载JDBC的实现 */
        // 把oracle.jdbc.OracleDriver类装载到内存中
        // 该类的静态块中的代码会进行Driver的注册
        //Class.forName("oracle.jdbc.OracleDriver");
        Class.forName("com.mysql.jdbc.Driver");
        // Driver driver = new OracleDriver();
        // DriverManager.registerDriver(driver);

        /* 创建连接 */
        // 调用DriverManager的getConnection方法
        // 该方法返回的是数据库厂商对Connection接口的
        // 实现类的对象(因为DriverManager
        // 已经注册了数据库厂商的Driver信息
        // url
        // 1) 用于表示数据库的连接信息(ip,port,数据库名称等等)
        // 2) 不同的数据库厂商,有特定的url的格式或标识
        // DriverManager会根据这个标识来选取不同的驱动信息
        // (如果同时注册了多个数据库厂商的实现)
        // user
        // password
        //String url = "jdbc:oracle:thin:@192.168.0.26:1521:tarena";
        String url = "jdbc:mysql://127.0.0.1:3306/pl";
        Connection con = DriverManager.getConnection(url, "root", "123456");
        System.out.println(con);
        // 执行SQL
        // Connection的createStatement()
        // 方法用于创建Statement实现类的对象
        Statement stmt = con.createStatement();
        // 执行DQL语句,返回值是ResultSet
        // 把SQL语句传输给数据库执行
        // 获取数据库传输回的结果数据
        // 并且把这个数据封装成ResultSet对象
        ResultSet rs = stmt
                .executeQuery("select empno,ename,sal, hiredate from emp");
        // 获取结果
        while (rs.next()) {
            String empno = rs.getString("empno");
            String ename = rs.getString("ename");
            String sal = rs.getString("sal");
            String hireDate = rs.getString("hiredate");
            System.out.println(empno + ", " + ename + ", "
                    + sal + ", " + hireDate);
        }
        // 关闭连接
        con.close();
    }
}