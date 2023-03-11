package strings;

public class TestStrings {

	public static void main(String[] args) {
		
		byte bytes[]= {65,66,67,68,69};
		String str = new String(bytes);
		
		  System.out.println(str.length()); System.out.println(str);
		  str="Welcome to UST Global";
		  
		  bytes= str.getBytes(); for(byte b:bytes) { System.out.println(b); }
		  
		  char chars[]= {'U','S','T',' ','G'}; str =new String(chars);
		  System.out.println(str); str.getChars(0,chars.length-1,chars,0); for(char
		  c:chars) { System.out.println(c); }
		 
		String string1= new String("She sells sea shells on the sea shore");
		int count=0;
		for(int i=0;i<string1.length();i++)
		{
			char c=string1.charAt(i);
			if(c=='S'||c=='s')
			{
				count++;
			}
		}
		System.out.println(count);
		String words[]= string1.split(" ");
		System.out.println(words.length);
		for(String word:words) {
			System.out.println(word);
		}
		String string2= new String("She sells sea. shells on the sea shore");
		String word1[]= string2.split("[.] ");
		for(String word:word1) {
			System.out.println(word);
		}
	
		String string = new String("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		
		int apos =string.indexOf('a');
		int tpos= string.indexOf('t');
		//String string2 = string.substring(apos, tpos+1);
		string2= string.substring(tpos);
		System.out.println(string2);
}
}

