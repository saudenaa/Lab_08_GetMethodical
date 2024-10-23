import java.util.Scanner;

public class Reggie {

    public static String getRegExString(Scanner in, String prompt, String regEx) {
        String input;
        boolean isValid = false;
        do {
            System.out.print(prompt);
            input = in.nextLine();
            if (input.matches(regEx)) {
                isValid = true;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        } while (!isValid);
        return input;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get SSN
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = getRegExString(in, "Enter a valid SSN (format: ###-##-####): ", ssnPattern);
        System.out.println("SSN: " + ssn);

        // Get UC Student M number
        String mNumberPattern = "^(M|m)\\d{8}$";
        String mNumber = getRegExString(in, "Enter your UC M number (format: M########): ", mNumberPattern);
        System.out.println("UC M Number: " + mNumber);

        // Get Menu Choice
        String menuPattern = "^[OoSsVvQq]$";
        String menuChoice = getRegExString(in, "Enter a menu choice (O/S/V/Q): ", menuPattern);
        System.out.println("Menu Choice: " + menuChoice);

        in.close();
    }
}


