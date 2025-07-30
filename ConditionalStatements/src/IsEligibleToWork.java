import java.util.Scanner;

public class IsEligibleToWork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter valid age: ");
        int age = userInput.nextInt();

        if (age < 0) {
            System.out.println("Invalid age!!!");
        } else {
            if (age >= 16) {
                System.out.println("The person is eligible to work!");
            } else {
                System.out.println("The person is not eligible to work!");
            }
        }
    }
}
