import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class DBOperations {

	public static void main(String[] args) {
		
		try
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sports","root","");
			String sql = "INSERT INTO affiliations (id, affiliation_key, affiliation_type, publisher_id) VALUES (?, ?, ?, ?)";
			//insert rows 
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setString(1, "116");
			statement.setString(2, "a111");
			statement.setString(3, "TN cup");
			statement.setString(4, "45");
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			else {
				System.out.println("Something went wrong");
			}
			//update row
			String sql_query = "UPDATE affiliations set affiliation_key=?,affiliation_type=?,publisher_id=? WHERE id=?";
			 
			PreparedStatement stm = (PreparedStatement) conn.prepareStatement(sql_query);
			stm.setString(1, "key000");
			stm.setString(2, "Chennai Teams");
			stm.setString(3, "111");
			stm.setString(4, "1");
			
			 
			int rowsUpdated = stm.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing row was updated successfully!");
			}
			//select rows
			String query = "select * from affiliations";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Key:"+rs.getString("affiliation_key")+"  "+"Type:"+rs.getString("affiliation_type"));
			}
			
		      // Delete a row
		      String delQuery = "delete from affiliations where id = ?";
		      PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(delQuery);
		      preparedStmt.setInt(1, 115);

		      preparedStmt.execute();
		      System.out.println("A row was deleted!");
		      conn.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
