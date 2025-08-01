import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = userInput.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The " + year + " is leap year.");
        } else {
            System.out.println("The " + year + " is not leap year.");
        }
    }
}
