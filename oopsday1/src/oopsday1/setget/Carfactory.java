package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		Car volvo = new Car();
		
		volvo.setColor("Red");   // INITIALISING THE DATA MEMBERS WITH SET METHOD
		volvo.setPrice(6500000);
		volvo.setBrand("Volvo");
		volvo.setModel("XC70");
		
		
		System.out.println(volvo.getColor());
		System.out.println(volvo.getPrice());
		System.out.println(volvo.getBrand());
		System.out.println(volvo.getModel());
		/*
		 * volvo.color = "Blue"; volvo.price = 6000000; volvo.brand = "Volvo";
		 * volvo.model = "XC40";
		 * 
		 * System.out.println(volvo.color); System.out.println(volvo.price);
		 * System.out.println(volvo.brand); System.out.println(volvo.model);
		 */
		
		System.out.println("\n");
		
		
		
		Car bmw = new Car();
		bmw.setColor("Black");
		bmw.setPrice(4500000);
		bmw.setBrand("BMW");
		bmw.setModel("Luxury SUV");
		
		System.out.println(bmw.getColor());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());
		
		/*
		 * bmw.color = "Gold"; bmw.price = 4000000; bmw.brand = "BMW"; bmw.model =
		 * "Golden Thunder";
		 * 
		 * System.out.println(bmw.color); System.out.println(bmw.price);
		 * System.out.println(bmw.brand); System.out.println(bmw.model);
		 */
	}

}
