import java.util.Scanner;

public class CalculateRevenue {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = userInput.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = userInput.nextInt();

        double totalPrice = unitPrice * qty, discount = 0.0d, discountPer = 0.0d;

        if (qty >= 100 && qty <= 120) {
            discountPer = 15;
            discount = totalPrice * (discountPer / 100);
            totalPrice *= 0.85;
        } else if (qty > 120) {
            discountPer = 20;
            discount = totalPrice * (discountPer / 100);
            totalPrice *= 0.80;
        }
        
        System.out.println("The revenue from sale: " + totalPrice + "$");
        System.out.println("Discount: " + discount + "$(" + discountPer + "%)");
    }
}
