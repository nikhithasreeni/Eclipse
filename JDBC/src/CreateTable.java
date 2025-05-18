
import java.sql.Connection;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "system@123");
        System.out.println("Connection Success");
        Statement st=conn.createStatement();
        st.execute("create table gama(rollno int(13),name varchar(20))");
        System.out.println("connection created successfully");
	}catch(Exception e) {
		System.err.println(e);
	}
	}
}
