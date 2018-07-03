package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*Fetch records from view
 *view created using joins
 * */
public class ViewRecords {

	public static void main(String[] args) {
		try
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sports","root","");
			//select rows from view
			String query = "select date,type,title from affiliations_view limit 50";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Date:"+rs.getString("date")+"  "+"Type:"+rs.getString("type")+"  "+"Title:"+rs.getString("title"));
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
