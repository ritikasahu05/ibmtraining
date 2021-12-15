import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
	public static void main(String[] args) {
		String sql="select * from Product";
		
		try {
			Connection conn=JdbcUtil.getConnection();
			Statement stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
				System.out.println(rs.getInt(3) + "\t" + rs.getString(1) + "\t" + rs.getDouble(2));
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}