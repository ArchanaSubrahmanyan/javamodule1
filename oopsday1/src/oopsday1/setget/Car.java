package oopsday1.setget;

public class Car {
	//properties/data members/instance variables
	//private data members ; access using get and set
	//local variable is dominant when compared to non local variables
	private String color;
	private double price;
	private String brand;
	private String model;
	public String getColor() {
		return this.color; 
	}
	public void setColor(String color) {
		this.color = color;// .this will give precedence to instance variable over parameters
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}
