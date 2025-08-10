import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = userInput.nextLine();

        System.out.println("Number of words: " + WordsCounter(input));
    }

    public static int WordsCounter(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
