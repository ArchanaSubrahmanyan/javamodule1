package testlambdas;

public class LambdaSwithCase {
	
	static double calculate(String operator,double x,double y) {
		
		return switch(operator) {
		
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" ->{
			if(y==0) {
				throw new IllegalArgumentException("Can't divide by zero");
			}
			yield x/y;
		}
		default -> throw new IllegalArgumentException("Unknown operator");
		};
	}

		public static void main(String[] args) {
			LambdaSwithCase lsc= new LambdaSwithCase();
			lsc.calculate("+", 10, 20);
			lsc.calculate("/",10, 0);
			lsc.calculate("_", 30, 10);
			
		}
		
	}

	
	

