package HomeWork;

import java.util.Scanner;

public class PrintTriangleArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter triangle's base: ");
        float base = input.nextFloat();

        System.out.print("Enter tirangle's height: ");
        float height = input.nextFloat();

        float triangleArea = (base * height) / 2;
        System.out.println("The triangle's area is " + triangleArea);
    }
}
