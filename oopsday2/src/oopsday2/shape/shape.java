package oopsday2.shape;

public class shape {

	public static void main(String[] args) {
		shapeIface rectangle= new rectangle(10,20);//interface has no object so calling using object class
		rectangle.area();
		System.out.println(rectangle);

	}

}
