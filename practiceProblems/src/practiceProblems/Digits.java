package practiceProblems;

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

			


