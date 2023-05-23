package Casestudy;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SignUp {
  private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]{4,}$");
  private static final Pattern MOBILE_PATTERN = Pattern.compile("^0[0-9]{9}$");
  private static final Pattern PASSWORD_PATTERN = Pattern.compile("^[a-zA-Z][@&][0-9]$");
  private static final Pattern DOB_PATTERN = Pattern.compile("^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/([0-9]{4})$");

  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);

    // Keep asking the user to enter their details until all fields are correctly entered
    while (true) {
      System.out.print("Please enter your full name: ");
      String fullName = scanner.nextLine();

      System.out.print("Please enter your mobile number (username): ");
      String mobileNumber = scanner.nextLine();

      System.out.print("Please enter your password: ");
      String password = scanner.nextLine();

      System.out.print("Please confirm your password: ");
      String passwordConfirmation = scanner.nextLine();

      System.out.print("Please enter your Date of Birth #DD/MM/YYYY (No space): ");
      String dobString = scanner.nextLine();

      // Validate the input fields
      if (!NAME_PATTERN.matcher(fullName).matches()) {
        System.out.println("Invalid full name. Please start again.");
        continue;
      }

      if (!MOBILE_PATTERN.matcher(mobileNumber).matches()) {
        System.out.println("Invalid mobile number. Please start again.");
        continue;
      }

      if (!PASSWORD_PATTERN.matcher(password).matches()) {
        System.out.println("Invalid password. Please start again.");
        continue;
      }

      if (!password.equals(passwordConfirmation)) {
        System.out.println("Your passwords are not matching. Please start again.");
        continue;
      }

      if (!DOB_PATTERN.matcher(dobString).matches()) {
        System.out.println("You have entered the Date of Birth in invalid format. Please start again.");
        continue;
      }

      // Parse the date of birth and calculate the age
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Calendar dob = Calendar.getInstance();
      dob.setTime(sdf.parse(dobString));
      Calendar now = Calendar.getInstance();
      int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

      if (age < 21) {
          System.out.println("You must be at least 21 years old to sign up. Please start again.");
          continue;
        }

        // Save the user's data in a suitable data structure
        User user = new User(fullName, mobileNumber, password, dobString);
        User[] users = new User[]{user};

        // Display a message indicating that the sign up process has been completed successfully
        System.out.println("You have successfully signed up.");
        break;
      }
    }
  }

  class User {
    private String fullName;
    private String mobileNumber;
    private String password;
    private String dob;

    public User(String fullName, String mobileNumber, String password, String dob) {
      this.fullName = fullName;
      this.mobileNumber = mobileNumber;
      this.password = password;
      this.dob = dob;
    }

    public String getFullName() {
      return fullName;
    }

    public String getMobileNumber() {
      return mobileNumber;
    }

    public String getPassword() {
      return password;
    }

    public String getDob() {
      return dob;
    }
  }
  
