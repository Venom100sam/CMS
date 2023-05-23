package Workshop6;
import java.util.Scanner;

public class Sum {
 
  public static void main(String[] args) {
    int sum = 0;									//1

    Scanner scanner = new Scanner(System.in);		//1

    System.out.print("Enter a number (0 to exit): ");		//1
    int num = scanner.nextInt();							//1

    while (num != 0) {										//n
      sum += num;											//n-1

      System.out.print("Enter a number (0 to exit): ");		//n-1
      num = scanner.nextInt();								//n-1
    }

    System.out.println("The sum is " + sum);				//1
  }
}

//tn=1++n+3n+1 =4n+2
//big o notation O(n)

