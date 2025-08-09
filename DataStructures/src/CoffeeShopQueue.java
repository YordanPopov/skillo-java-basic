import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class CoffeeShopQueue {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Queue<String> customers = new LinkedList<>();

        while (true) {
            System.out.println("\n---- COFFEE SHOP MENU ----");
            System.out.println("1. Add customer");
            System.out.println("2. View current line");
            System.out.println("3. Serve next customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = userInput.nextLine();
                    customers.add(customerName);
                    System.out.println("Customer is added!");
                    break;

                case 2:
                    if (customers.isEmpty()) {
                        System.out.println("No customers yet.");
                    } else {
                        System.out.println("Current customers line: " + customers);
                    }
                    break;

                case 3:
                    if (customers.isEmpty()) {
                        System.out.println("No customers yet.");
                    } else {
                        String servedCustomer = customers.poll();
                        System.out.println("Serving: " + servedCustomer);
                    }
                    break;

                case 4:
                    System.out.println("GOODBYE!!!");
                    userInput.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
