package Workshop6;
import java.util.Scanner;

public class Reverse_number {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a four-digit number: ");
    int num = scanner.nextInt();

    int thousands = num / 1000;

    int hundreds = (num % 1000) / 100;

    int tens = (num % 100) / 10;

    int ones = num % 10;

    System.out.println(ones * 1000 + tens * 100 + hundreds * 10 + thousands);
  
}


}
//O(1)