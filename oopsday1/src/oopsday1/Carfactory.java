package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		Car volvo = new Car();
		volvo.color = "Blue";
		volvo.price = 6000000;
		volvo.brand = "Volvo";
		volvo.model = "XC40";
		
		System.out.println(volvo.color);
		System.out.println(volvo.price);
		System.out.println(volvo.brand);
		System.out.println(volvo.model);

		
		
		Car bmw = new Car();
		bmw.color = "Gold";
		bmw.price = 4000000;
		bmw.brand = "BMW";
		bmw.model = "Golden Thunder";
		
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
	}

}
