package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtils {
    private static String driver;

    private static String url;

    private static String user;

    private static String password;

    static {
        try {
            Properties props = new Properties();
            // 从类路径中加文件
//			props.load(DBUtils.class.getClassLoader().getResourceAsStream("db.properties")); //path不以’/'开头时，默认是从此类所在的包下取资源；
            props.load(DBUtils.class.getResourceAsStream("/db.properties")); //  path 以’/'开头时，则是从ClassPath根下获取；相当于target目录(Idea环境下)。

            //也等价于
//			URL resource =DBUtils.class.getClassLoader().getResource("db.properties");
//			URL resource = DBUtils.class.getResource("/db.properties");
//			InputStream inputStream=new FileInputStream(resource.getPath());
//			props.load(inputStream);

            driver = props.getProperty("driver");
            url = props.getProperty("url");
            user = props.getProperty("user");
            password = props.getProperty("password");

            Class.forName(driver);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static Connection openConnection()
            throws Exception {
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }
}
