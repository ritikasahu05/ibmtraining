import  java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/training";
		Connection conn = null;
		
		try {
			DriverManager.registerDriver(new Driver());
			conn = DriverManager.getConnection(url, "root", "Ritika@1997*");
			System.out.println("Connected Successfully...");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: "+meta.getDatabaseProductName());
			System.out.println("DB version: "+meta.getDatabaseProductVersion());
			System.out.println("Driver Name: "+meta.getDriverName());
			System.out.println("Driver Version: "+meta.getDriverVersion());
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
