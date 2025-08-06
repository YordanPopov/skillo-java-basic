import java.util.Scanner;

public class PrintUserInput {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[][] numbers = {
                {1, 2, 3, 4},
                {8, 7, 6, 5}
        };

        System.out.println("Please, enter current row: ");
        int row = userInput.nextInt();

        System.out.println("Please, enter current col: ");
        int col = userInput.nextInt();

        System.out.println("Cuttent element is: " + numbers[row][col] );
    }
}
