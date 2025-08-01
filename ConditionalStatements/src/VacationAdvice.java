import java.util.Scanner;

public class VacationAdvice {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Choose a vacation - Beach or Mountain: ");
        String vacationType = userInput.nextLine();

        System.out.print("Enter your budget: ");
        double budget = userInput.nextDouble();

        if (vacationType.equals("Beach")) {
            if (budget < 50) {
                System.out.println("Choose Bulgaria!");
            } else {
                System.out.println("Choose somewhere outside Bulgaria!");
            }
        } else if (vacationType.equals("Mountain")) {
            if (budget < 30) {
                System.out.println("Choose Bulgaria!");
            } else {
                System.out.println("Choose somewhere outside Bulgaria!");
            }
        } else {
            System.out.println("Invalid vacation type!");
        }
    }
}
