import java.util.Scanner;

public class PrintMiddleCharacter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = userInput.nextLine();

        System.out.println("Middle character is: " + FindMiddleCharacter(word));
    }

    public static String FindMiddleCharacter(String word) {
        int length = word.length();
        int middle = length / 2;
        String middleChar = "";

        if (length % 2 == 0) {
            middleChar = word.substring(middle - 1, middle + 1);
        } else {
            middleChar += word.charAt(middle);
        }

        return  middleChar;
    }
}
