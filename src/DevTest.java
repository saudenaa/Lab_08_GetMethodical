import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        // Create a Scanner object for testing methods that require user input

        Scanner in = new Scanner(System.in);


        //Testing Part A:Get a non-zero length string
        String name = SafeInput.getNonZeroLenString(in,"Enter your name: ");
        System.out.println("Hello," + name + "!");



        // Testing Part B: Get an integer
        int age = SafeInput.getInt(in,"Enter your age: ");
        System.out.println("You are " + age + " years old.");



        // Testing Part C: Get a double
        double salary = SafeInput.getDouble(in,"Enter your salary: ");
        System.out.println("Your salary is $" + salary);



        // Testing Part D: Get a ranged integer
        int rangedValue = SafeInput.getRangedInt(in, "Enter a number", 1, 10);
        System.out.println("You entered a valid ranged integer: " + rangedValue);




        // Testing Part E: getRangedDouble
        double rangedDoubleValue = SafeInput.getRangedDouble(in,"Enter a double within range", 1.0, 100.0);
        System.out.println("You entered: " + rangedDoubleValue);

        // Testing Part F:getYNConfirm
        boolean yesNo = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You entered: " + (yesNo ? "True" : "False"));



        // Testing Part G: getRegExString
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + ssn);


        // Clean up
        in.close();






    }
}

