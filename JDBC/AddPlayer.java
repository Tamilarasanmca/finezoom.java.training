import java.util.Scanner;  
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;

public class AddPlayer {

	public static void main(String[] args) {
		
		try
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sports","root","");
			Scanner sc=new Scanner(System.in);  
			 System.out.println("Enter Player's ID:");  
			   int id=sc.nextInt();
			   
			   
			   System.out.println("Enter Player's Name:");  
			   String name=sc.next();
			   
			   
			   System.out.println("Enter Player's Team:");  
			   String team=sc.next();
			   
			   
			   System.out.println("Enter Player's Country:");  
			   String country=sc.next();
			String sql = "INSERT INTO player_details (player_id, player_name, team, country) VALUES (?, ?, ?, ?)";
			//insert rows 
			PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setString(3, team);
			statement.setString(4, country);
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			else {
				System.out.println("Something went wrong");
			}
			sc.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
