package oopsday3.line;
import java.util.Scanner;

public class PointMain {

	public static void main(String[] args) {
		
		Point1 p1=new Point1();
		Point2 p2=new Point2();
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter first coordinates");
		 p1.setX1(scanner.nextInt());
		 p1.setY1(scanner.nextInt());
		 System.out.println("Enter second coordinates");
		 p2.setX2(scanner.nextInt());
		 p2.setY2(scanner.nextInt());
		 int a= p1.getX1();
		 int b= p2.getX2();
		 drawline draw = new drawline();
		 draw.drawline(a,b);
		
		 
		 
		 
		 
		
	}
}


