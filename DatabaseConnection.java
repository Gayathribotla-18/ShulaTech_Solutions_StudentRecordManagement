import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/StudentDB";
    private static final String USER = "root"; // Change if needed
    private static final String PASSWORD = "password"; // Change if needed
	public static Connection getConnection()
	{
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } 
		catch (Exception e) 
		{
            e.printStackTrace();
            return null;
        }
    }
}
