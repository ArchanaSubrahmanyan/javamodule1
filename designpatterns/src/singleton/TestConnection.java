package singleton;

public class TestConnection {

	public static void main(String[] args) {

		//here even if we are giving it in a loop only one object is creating and the same object is referencing 
		for(int i=1;i<10;i++) {
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("Connection is singleton");
		}
		else
			System.out.println("Connection is not a singleton");
	}

}
}
