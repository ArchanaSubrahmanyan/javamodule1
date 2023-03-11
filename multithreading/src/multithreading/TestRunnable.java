package multithreading;

public class TestRunnable {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		System.out.println("Mains priority="+Thread.currentThread().getPriority());
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		
		t1.setDaemon(true);//if the child threads are daemon threads and the main is executed till dead the main will not wait for the child threads to finish
		t2.setDaemon(true);
		//only thread instances can be started.
		t1.start();
		t2.start();
		t1.setPriority(Thread.MAX_PRIORITY); //setting priority
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("T1's priority ="+t1.getPriority());//whatever is the priority of main,child also gets the same.
		System.out.println("T2's priority ="+t2.getPriority());
		
		System.out.println("Main exited");   
	}

}
