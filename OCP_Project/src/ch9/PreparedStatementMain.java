/**
 * 
 */
package ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Mohammad Najar
 *
 */
public class PreparedStatementMain {

	private static final String url = "jdbc:mysql://localhost/sakila?";
	private static final String username = "root";
	private static final String password = "root";
	private static String sql;
	private static ResultSet rs;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sql = "SELECT * FROM actor LIMIT ?";
		
		try (Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, 5);
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getTime(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
