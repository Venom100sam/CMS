package Regex;

import java.util.Scanner;

class Validator {
    public static void main(String[] args) {
        // Prompt the user for a password
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        // Define the regular expression for validating the email address
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@heraldcollege\\.edu\\.np$";

        // Check if the email address is valid
        if (email.matches(regex)) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }
        
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Define the regular expression for validating the password
        regex = "^[A-Z][a-zA-Z0-9!@#$%^&*()_+-=\\[\\]{};':\"\\\\|,.<>\\/?]*[0-9]$";

        // Check if the password is valid
        if (password.matches(regex)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid.");
        }
        scanner.close();
    }
 }