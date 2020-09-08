package day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestWrapper {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pl",
				"root", "123456");

		Connection con = new MyWrapper(con1);

		PreparedStatement stmt
				= con.prepareStatement("select count(*) from foo");

		con.close();
	}
}
