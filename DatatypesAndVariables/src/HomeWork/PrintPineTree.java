package HomeWork;

import java.util.Scanner;

public class PrintPineTree {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = input.nextInt();

        for (int i = 0; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
