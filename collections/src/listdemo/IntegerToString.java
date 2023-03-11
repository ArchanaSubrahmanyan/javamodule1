package listdemo;

public class IntegerToString {
	public static void main(String[] args) {
		int i=12321;
		String str = i+"";
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		//System.out.println(rev);
		boolean result= str.equals(sb.toString());   
		System.out.println(result);	
		
		int n=10;
		String s = new String("10");
		Integer integer = new Integer("10");
		String sint = s.valueOf(i);
		int m = Integer.parseInt(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
