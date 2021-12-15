import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public final class JdbcUtil {
	private JdbcUtil() {	
	}

	public static Connection getConnection() throws Exception{
		String url = "jdbc:mysql://localhost:3306/training";
		DriverManager.registerDriver(new Driver());
		Connection conn = DriverManager.getConnection(url, "root", "Ritika@1997*");
		return conn;
	}
}
