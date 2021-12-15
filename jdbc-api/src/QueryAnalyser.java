import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class QueryAnalyser {

	public static void main(String[] args) {
		String sql = "select code, price from product";
		
		Connection conn=JdbcUtil.getConnection();
		ResultSet rs =conn.createStatement().executeQuery(sql);
		ResultSetMetaData meta= rs.getMetaData();
		for(int c=1; c<=meta.getColumnCount(); c++)
			System.out.println(meta.getColumnName(c).toUpperCase()+"\t");
		System.out.println();
		
		while(rs.next()) {
			for(int c=1; c<=meta.getColumnCount(); c++)
				System.out.println(rs.getString(c)+"\t");
			System.out.println();
		}

	}

}
