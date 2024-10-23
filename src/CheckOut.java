import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            // Get the price of the item within the range of $0.50 to $10.00
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);
            totalCost += price;

            // Ask if there are more items
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items (y/n)?");
        } while (moreItems);

        // Print the total cost
        System.out.printf("The total cost is $%.2f%n", totalCost);
    }
}

