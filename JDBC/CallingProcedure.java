import java.sql.*;
import java.util.Scanner;
 
/**
 * Call a MySQL stored procedure
 * that returns a result set and process this result set.
 */
public class CallingProcedure {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String dbURL = "jdbc:mysql://localhost/sports";
        String user = "root";
        String password = "";
 
        try (
            Connection conn = DriverManager.getConnection(dbURL, user, password);
        	//calling stored procedure	
            CallableStatement statement = conn.prepareCall("{call name(?)}");
        ) {
        	System.out.print("Enter the name to get reocrd:");
            String name = s.next();
            statement.setString(1, name);
 
            boolean hadResults = statement.execute();
 
            while (hadResults) {
                ResultSet resultSet = statement.getResultSet();
 
                // process result set
                while (resultSet.next()) {
                    String player_name = resultSet.getString("player_name");
                    String team = resultSet.getString("team");
                    String country = resultSet.getString("country");
 
                    System.out.println(
                            "| " + player_name + " | " + team + " | " + country + " |");
                }
 
                hadResults = statement.getMoreResults();
            }
 
            statement.close();
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

	}

}
