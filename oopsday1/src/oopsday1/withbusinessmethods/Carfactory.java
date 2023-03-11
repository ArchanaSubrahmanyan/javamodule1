package oopsday1.withbusinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		Car volvo = new Car("Yellow",7000000,"Toyota","Innova");
		
		volvo.start();
		volvo.changeGear(1);
		volvo.stop();
		
		
		Car bmw = new Car("White",6500000,"BMW","Sports SUV");
		bmw.start();
		bmw.changeGear(5);
		bmw.stop();
		
		
	
	}

}
