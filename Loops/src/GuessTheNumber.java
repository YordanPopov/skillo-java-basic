import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public  static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(100) + 1;

        System.out.print("Guess the number: ");
        int userAssumption = userInput.nextInt();

        while(userAssumption != randomNumber) {
            if (userAssumption > randomNumber) {
                System.out.println("High");
            } else {
                System.out.println("Low");
            }

            System.out.print("Next try: ");
            userAssumption = userInput.nextInt();
        }

        System.out.println("Congratulations, you guessed the number.");
        System.out.printf("The random number was %d.", randomNumber);
    }
}
