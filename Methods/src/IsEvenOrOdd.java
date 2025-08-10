import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter whole number: ");
        int input = userInput.nextInt();

        System.out.println(IsEven(input));
    }

    public static boolean IsEven(int arg) {
        return arg % 2 == 0;
    }
}
