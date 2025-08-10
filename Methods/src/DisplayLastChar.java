import java.util.Scanner;

public class DisplayLastChar {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = userInput.nextLine();

        if (input.isEmpty()) {
            System.out.println("There no text to display");
        } else {
            System.out.println(DisplayLastCharacter(input));
        }
    }

    public static char DisplayLastCharacter(String text) {
            return text.charAt(text.length() - 1);
    }
}
