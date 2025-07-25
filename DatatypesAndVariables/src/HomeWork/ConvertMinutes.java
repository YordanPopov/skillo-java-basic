package HomeWork;

import java.util.Scanner;

public class ConvertMinutes {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a minutes: ");
        double minutes = input.nextDouble();

        double years = minutes * 0.0000019013;
        double days = minutes * 0.000694444444;

        System.out.println("Minutes in years: " + years);
        System.out.println("Minutes in days: " + days);
    }
}
