
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/test";
	String user="root";
	String password="system@123";
	
	String query="insert into delta values(123,'sai)";
	try {
		Connection connection =DriverManager.getConnection(url, user, password);
		System.out.println("connection established........");
		Statement statement=connection.createStatement();
		System.out.println("statement created.......");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}