package multithreading;
import java.util.Scanner;

public class MyRunnable implements Runnable {

	//run is the entry point for every child thread
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter your input");  //blocked for IO;one of the thread will be blocked for input
			int a = new Scanner(System.in).nextInt();
			System.out.println("Got the input proceeding");
			
			
			System.out.println(Thread.currentThread().getName() +" = "+ i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
