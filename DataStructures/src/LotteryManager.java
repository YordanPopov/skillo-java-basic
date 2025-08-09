import java.util.ArrayList;
import java.util.Scanner;

public class LotteryManager {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> winningNumbers = new ArrayList<>();

        while (true) {
            System.out.println("\n--- LOTTERY MENU ---");
            System.out.println("1. Add Winning Numbers");
            System.out.println("2. View Winning Numbers");
            System.out.println("3. Check a Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter winning number: ");
                    int number = userInput.nextInt();

                    if (!winningNumbers.contains(number)) {
                        winningNumbers.add(number);
                        System.out.println("Number added!");
                    } else {
                        System.out.println("Number is already in list!");
                    }
                    break;

                case 2:
                    if (!winningNumbers.isEmpty()) {
                        System.out.println("Winning numbers: " + winningNumbers);
                    } else {
                        System.out.println("No winning numbers yet!");
                    }
                    break;

                case 3:
                    System.out.print("Enter number to check: ");
                    int checkNumber = userInput.nextInt();

                    if (winningNumbers.isEmpty()) {
                        System.out.println("No winning numbers yer!");
                    } else {
                        if (winningNumbers.contains(checkNumber)) {
                            System.out.println(checkNumber + " is a WINNING number.");
                        } else {
                            System.out.println(checkNumber + " is NOT a winning number.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Bye Bye!");
                    userInput.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
