package librarymanagement;

import java.sql.*;

public class conn {
	Connection c;
	Statement s;

	public conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "root");
			s = c.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] srgs) {
		conn c = new conn();

	}

}
