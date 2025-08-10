import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = userInput.nextInt();

        boolean isPal = IsPalindrome(input);

        if (isPal) {
            System.out.println("The number is palindrome!");
        } else {
            System.out.println("The number is not palindrome!");
        }
    }

    public static boolean IsPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
