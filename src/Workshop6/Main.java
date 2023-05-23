package Workshop6;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
	HashMap<Integer,String> language = new HashMap<>();
	
	language.put(1,"java");
	language.put(2,"python");
	language.put(3,"javascript");
	System.out.println("HashMap:"+language);
	
	System.out.print("keys:");
	for(Integer key : language.keySet()) {
		System.out.print(key);
		System.out.println(",");
	}
	System.out.println("\nValues:");
	for(String value : language.values()) {
		System.out.println(value);
		System.out.println(",");
	}
	
	System.out.println("\nEntries:");
	for(Entry<Integer,String>entry : language.entrySet()) {
		System.out.println(entry);
		System.out.println(",");
	}
	}

}
