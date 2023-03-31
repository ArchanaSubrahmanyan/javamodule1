package factory;

public class UseVehicleFactory {

	public static void main(String[] args) {
		Vehicle Seltos = VehicleFactory.newInstance("Seltos");
		Seltos.start();
		
		Vehicle XCross = VehicleFactory.newInstance("XCross");
		XCross.stop();
		
		
	}
}
