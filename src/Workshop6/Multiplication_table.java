package Workshop6;

public class Multiplication_table {
	 public static void main(String[] args) {

	System.out.println(" x | 1 	2 	3 	4 	5 	6 	7 	8 	9 	10");
	System.out.println("----------------------------------------------------------------------------");


    for (int i = 1; i <= 10; i++) {
	System.out.print(String.format("%2d |", i));
	for (int j = 1; j <= 10; j++) {
	System.out.print(String.format("%2d	", i * j));
		      }
    System.out.println();
		    }
		  }
		}


// O(n^2)
//n * n, or n^2
 