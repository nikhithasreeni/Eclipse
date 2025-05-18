

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?user=root&password=system@123";
        String createTableQuery = "CREATE TABLE delta (" +
                "id INT NOT NULL, " +
               "name VARCHAR(255), " +
                "salary INT, " +
                "designation VARCHAR(255), " +
                "PRIMARY KEY (id))";

        try {
            // Establish connection
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connection established...");

            // Create statement
            Statement statement = connection.createStatement();
            System.out.println("Statement created...");

            // Execute SQL query to create table
            statement.executeUpdate(createTableQuery);
            System.out.println("Table created...");

            // Close connection
            connection.close();
            System.out.println("Connection closed...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}