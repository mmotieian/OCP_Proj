package ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddDataMain {

	private static final String url = "jdbc:mysql://localhost/sakila?";
	private static final String username = "root";
	private static final String password = "root";

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
			String sql = "INSERT INTO ACTOR VALUES ('FATEMEH', 'SALEHI', 'F', 29)";

			con.setAutoCommit(false);
			Statement statement = con.createStatement();
			int rows = statement.executeUpdate(sql);
			con.setAutoCommit(true);
			con.commit();

			System.out.println(rows);

		} catch (SQLException e) {

			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}

		} finally {

			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}

}
