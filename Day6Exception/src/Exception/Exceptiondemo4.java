package Exception;
import java.sql.*;

public class Exceptiondemo4 {
	
	static void method() throws SQLException{
		throw new SQLException("Connection failed");
	}

	public static void main(String[] args) throws SQLException{
		
		method();
		
		/*
		try {
			method();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		*/

	}

}
 