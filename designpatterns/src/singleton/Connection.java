//singleton pattern

package singleton;

public class Connection {

	//make the reference static
	static Connection con;
	
	//for singleton first step is to make the constructor as private
	private Connection() {
		
	}
	public static Connection getConnection() {
		//return the same instance again
		if(con!=null)
			return con;
		else
			con=new Connection();
		return con;
		//return new Connection();
	}
}
