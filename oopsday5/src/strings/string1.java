package strings;

public class string1 {

	public static void main(String[] args) 
	{
		String string = new String("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		
		int apos =string.indexOf("a");
		int tpos= string.indexOf("t");
		System.out.println(apos);
		System.out.println(tpos);
		//String string2 = string.substring(apos, tpos+1);
		String string2= string.substring(tpos);
		System.out.println(string2);
		
		
	/*
		string =new String("madam");
		int mpos =-1;
		int dpos = string.indexOf('d',-1);
		string2 =string.substring(-1, dpos);
		System.out.println(string2);
		
		*/
		string = new String("madamdam");
		int dpos= string.lastIndexOf('d');
		System.out.println(dpos);
		string2=string.substring(dpos, string.length());
		System.out.println(string2);
		string2=string.substring(0, 3);
		System.out.println(string2);
		
		
		String email = new String("archana.subrahmanyan@ust.com");
		int spos= email.lastIndexOf(".");
		System.out.println(spos);
		string2=email.substring(0, spos);
		System.out.println(string2);
		
		
		
		
		String s1= new String("welcome");
		String s2=new String("WELCOME");
		boolean result = s1.equalsIgnoreCase(s2);
		System.out.println(result);
		int val= s2.compareTo(s1);
		System.out.println(val);
		
		
		String s3= new String("welcome");
		String s4=new String("welcome");
		boolean result1 = s3.equalsIgnoreCase(s4);
		System.out.println(result1);
		int val1= s4.compareTo(s3);
		System.out.println(val1);
		string="DieharD";
		System.out.println(string.toLowerCase());
		System.out.println(string);
		System.out.println(string.toUpperCase());
		System.out.println(string);
		
		//string objects are immutable.their values will not change after they are created.Immutable means we can't append or insert or do anything in the string
		//because of this 2 other classes are created StringBuffer and StringBuilder
		
		// 16-11-477/6/A/3 Hyderabad 500036  digits,letters,neither digits nor letter
		
		string="16-11-477/6/A/3 Hyderabad 500036";
	    int digit=0;
		int letter=0;
		int notdl =0;
		for(int i=0;i<string.length();i++) {
			
			char c=string.charAt(i);
			if(Character.isDigit(c)) {
				digit++;
			}
			else if(Character.isLetter(c)) {
				letter++;
			}
			else
				notdl++;
		}
		System.out.println(digit);
		System.out.println(letter);
		System.out.println(notdl);
		
		
		
		
		
	}

}
