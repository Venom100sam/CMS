package Workshop6;
 

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfNames {
	ArrayList<String> names = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	public void printListt() {
		int i;
		System.out.println("Enter 10 names:");
		for(i=0;i<10;i++) {
			names.add(i,input.nextLine());
			System.out.println(names);	
		}	
		
		names.removeAll(names);
		System.out.println(names);
		
	}
	
	public static void main(String[] args) {
		ListOfNames list = new ListOfNames();
		list.printListt();
		
	}
	

}
