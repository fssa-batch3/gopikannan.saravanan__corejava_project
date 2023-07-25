package day12.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import day11.solved.ConnectionUtil;

/**
 * @author BharathwajSoundarara
 *
 */
public class TestUserUpdatePassword {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/project";
		Connection connection = DriverManager.getConnection(url, "root", "123456");

		// Input
		String userName = "Gopi";
		String password = "09876";

		// DEPOSIT
		String query = "UPDATE user SET password=? WHERE first_name=?";

		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, password);
		pst.setString(2, userName);

		int rows = pst.executeUpdate();
		System.out.println("No of rows updated" + rows);
	}

}