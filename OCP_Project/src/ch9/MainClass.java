package ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost/sakila?";
		String username = "root";
		String password = "root";
		
		DateFormat date = DateFormat.getTimeInstance();

		try (Connection con = DriverManager.getConnection(url, username, password)) {

			String sql = "SELECT * FROM ACTOR LIMIT 10";

			java.sql.Statement statement = con.createStatement();

//			ResultSet rs1 = RowSetProvider.newFactory().createJdbcRowSet();
			ResultSet rs = statement.executeQuery(sql);
			// PreparedStatement ps = con.prepareStatement(sql);
			// ResultSet rs = ps.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();

			for (int i = 1; i <= rsmd.getColumnCount(); i++) {

				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			System.out.println("--------------------------------");

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(date.format(rs.getTime(4)));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
