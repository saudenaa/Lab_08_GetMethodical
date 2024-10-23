import java.util.Scanner;

public class BirthDateTime {

    public static int getRangedInt(Scanner in, String prompt, int low, int high) {
        int input;
        boolean isValid = false;
        do {
            System.out.print(prompt + " (" + low + " - " + high + "): ");
            if (in.hasNextInt()) {
                input = in.nextInt();
                if (input >= low && input <= high) {
                    isValid = true;
                    return input;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // clear the invalid input
            }
        } while (!isValid);
        return -1; // should never reach here
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get year
        int year = getRangedInt(in, "Enter your birth year", 1950, 2015);

        // Get month
        int month = getRangedInt(in, "Enter your birth month", 1, 12);

        // Determine the number of days in the selected month
        int daysInMonth = 31; // default for months with 31 days
        switch (month) {
            case 2: // February
                daysInMonth = 29; // Leap year support can be added later
                break;
            case 4: case 6: case 9: case 11: // Months with 30 days
                daysInMonth = 30;
                break;
        }

        // Get day
        int day = getRangedInt(in, "Enter your birth day", 1, daysInMonth);

        // Get hour (1-24)
        int hour = getRangedInt(in, "Enter the hour of your birth", 1, 24);

        // Get minute (1-59)
        int minute = getRangedInt(in, "Enter the minute of your birth", 1, 59);

        // Display the collected information
        System.out.printf("Your date of birth is: %04d-%02d-%02d %02d:%02d%n", year, month, day, hour, minute);

        in.close();
    }
}
