package day02.utils;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.util.Properties;

public class DBUtils {
    private static String driver;

    private static String url;

    private static String user;

    private static String password;

    private static BasicDataSource ds;

    static {
        try {
            Properties props = new Properties();
            // 从类路径中加文件
            props.load(DBUtils.class.getClassLoader().getResourceAsStream("db.properties"));

            driver = props.getProperty("driver");
            url = props.getProperty("url");
            user = props.getProperty("user");
            password = props.getProperty("password");

            ds = new BasicDataSource();
            ds.setDriverClassName(driver);
            ds.setUrl(url);
            ds.setUsername(user);
            ds.setPassword(password);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws Exception {
        Connection con = ds.getConnection();
        return con;
    }

    public static void main(String[] args) throws Exception {
        Connection con = getConnection();
        System.out.println(con.getClass().getName());
    }
}
