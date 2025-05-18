 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection3 {
    static Connection conn;

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system@123");
            System.out.println("Connection Success");
        } catch (SQLException e) {
            System.out.println("Connection Unsuccessful"+e.getMessage());
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println("Connection close Unsuccessful" + e.getMessage());
            }
        }
    }
}