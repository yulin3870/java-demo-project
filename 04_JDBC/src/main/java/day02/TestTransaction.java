package day02;

import day02.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestTransaction {
	public static void main(String[] args) throws Exception {
		Connection con = null;

		try {
			con = DBUtils.getConnection();

			// 设置自动提交为false, JDBC不会在DML语句执行后加commit
			con.setAutoCommit(false);

			PreparedStatement stmt1 = con.prepareStatement("update account "
					+ "set amount=amount-500 where id=100");
			System.out.println("-500");
			stmt1.executeUpdate();

			if (1 == 1) {
				throw new Exception("专门出的异常");
			}

			PreparedStatement stmt2 = con.prepareStatement("update account "
					+ "set amount=amount+500 where id=200");
			System.out.println("+500");
			stmt2.executeUpdate();

			con.commit();

		} catch (Exception e) {
			System.out.println("rollback");
			con.rollback();
			e.printStackTrace();
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}
}
