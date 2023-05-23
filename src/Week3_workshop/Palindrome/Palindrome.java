package Week3_workshop.Palindrome;

public class Palindrome {

	  public static boolean isPalindrome(int number) {
	        int temp = number;
	        int digit, result = 0;
	        while (temp > 0) {
	            digit = temp % 10;
	            result = result * 10 + digit;
	            temp /= 10;
	        }
	        return (result == number);
	    }


	     public static boolean isPalindrome(String string) {
	     String reverse = "";
	     for (int i = string.length() - 1; i >= 0; i--) {
	     reverse += string.charAt(i);
	     }
	     return (reverse.equals(string));
	     }
}