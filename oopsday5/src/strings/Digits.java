
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5units by creating a class named 'Triangle' without any parameter in its constructor.

package strings;

class Triangle{
	
	private int length;
	private int width;
	private int height;
	
	Triangle(){
		length=3;
		width=4;
		height=5;
	}
	public void getArea() {
		System.out.println(length*width*height);
	}
}
public class Digits{
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.getArea();
	}
}

			


