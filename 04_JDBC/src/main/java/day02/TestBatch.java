package day02;

import day02.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestBatch {
	public static void main(String[] args) throws Exception {
		Connection con = DBUtils.getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into foo (id, name) "
				+ "values(?,?)");

		// 批量插入
		for (int i = 1; i <= 900000; i++) {
			stmt.setInt(1, i);
			stmt.setString(2, "name" + i);
			stmt.addBatch(); // 添加批处理
			if (i % 10000 == 0) {
				stmt.executeBatch(); // 每10000为一批
				System.out.println(i);
			}
		}
		stmt.executeBatch(); // 执行批处理
		con.close();
	}
}
