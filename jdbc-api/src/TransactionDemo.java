import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		String sql1= "insert into product values(123, 'iPencil', 2000)";
		String sql2="update product set price=49000 where code=121";
		String sql3="delete from product where cod=421";
		
		Connection conn=null;
		try {
			conn = JdbcUtil.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt=conn.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			conn.commit();
			System.out.println("Transaction successfully completed.");
		} catch (SQLException e) {
			System.out.println("Transaction failed due to...");
			e.printStackTrace();
			try {
				conn.rollback();
			}  catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	

