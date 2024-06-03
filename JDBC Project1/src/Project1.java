import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Project1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/jdbc";
		String uname = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(url, uname, password);
		boolean execute = connection.createStatement().execute("create table students(id int, name varchar(20))");
		System.out.println(connection+" "+ execute +" "+ "Success");

	}

}
