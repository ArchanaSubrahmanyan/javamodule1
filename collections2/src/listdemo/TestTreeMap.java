package listdemo;

import java.util.Collection;
//not maintaining the insertion order
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	
	public static void main(String[] args) {
		TreeMap<String, String> countryCurr = new TreeMap<>();

		countryCurr.put("IND", "Rupee");
		countryCurr.put("USA", "Dollar");
		countryCurr.put("UK", "Pound");

		System.out.println(countryCurr);
		
		System.out.println(countryCurr.get("IND"));
		countryCurr.put("IND", "Rupees"); //if a key is found it will replace the old value with new value;
		System.out.println(countryCurr);
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Dollars"));
		
		//HashMap has 3 views
		//1.key view
		Set<String> keys = countryCurr.keySet();
		for(String key: keys)
		{
			System.out.println(key);
		}
		//2.values view
		Collection<String> values = countryCurr.values();
		for(String value:values)
		{
			System.out.println(value);
		}
		//3.key values together - Entry
		Set<Entry<String,String>> entries = countryCurr.entrySet();
		for(Entry<String,String> entry:entries) {
			System.out.println(entry);
		}
		
	}

}
