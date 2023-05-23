package Workshop6;
import java.util.Scanner;
import java.util.ArrayList;

public class Newok {

 
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<10; i++)
		{
			System.out.println("enter element "+(i+1)+": ");
			String input = sc.next();
			list.add(input);
		}
		sc.close();
		System.out.println("list before: ");
		System.out.println(list);
		list.removeAll(list);
		System.out.println("list after: ");
		System.out.println(list);
	
}

}
