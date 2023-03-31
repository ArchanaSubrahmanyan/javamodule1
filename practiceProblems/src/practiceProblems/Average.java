
//Print the average of three numbers entered by user by creating a class named 'Average'having a method to calculate and print the average

package practiceProblems;

import java.util.Scanner;

class Avg{
	
	private int a;
	private int b;
	private int c;
	private int avg;
	
	Avg(){
		
	}
	Avg(int a,int b,int c){
		this.a= a;
		this.b= b;
		this.c= c;
	}
	public int calAvg() {
		avg = ((a+b+c)/3);
		return avg;
	}
	public void printAvg() {
		System.out.println("Average is :"+avg);
	}
	
}

public class Average {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		Avg average = new Avg(num1,num2,num3);
		average.calAvg();
		average.printAvg();
	}

	
	
}
