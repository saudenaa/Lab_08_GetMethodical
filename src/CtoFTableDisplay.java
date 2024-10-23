public class CtoFTableDisplay {

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");  // Header for the table
        System.out.println("-----------------------------");
        // Loop from -100 to 100 to display Celsius and Fahrenheit values
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);  // Convert each Celsius value to Fahrenheit
            System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);  // Print Celsius and Fahrenheit
        }
    }
}
