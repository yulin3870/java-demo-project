package day02;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

public class TestDBCP {
	public static void main(String[] args) throws Exception {
		BasicDataSource ds = new BasicDataSource();

		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/pl");
		ds.setUsername("root");
		ds.setPassword("123456");

		ds.setInitialSize(10); // 初始时连接的个数
		ds.setMaxActive(100); // 最大活动连接个数
		ds.setMaxIdle(5);// 最大空闲连接个数

		Connection con = ds.getConnection();
		System.out.println(con);
	}
}
