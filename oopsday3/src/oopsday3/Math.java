package oopsday3;

public class Math {

	public static void main(String[] args) {
		MathIface op = new Operations(5);
		op.PositiveOrNegative();
		op.EvenOrOdd();
		op.SumOfNumbers();
		op.Factorial();
		op.PrimeOrNot();
		op.Reverse();
		op.ArmstrongNumber();
		

	}

}
