package HomeWork;

import java.util.Scanner;

public class PrintTrianglePerimeter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side-a:");
        float sideA = input.nextFloat();

        System.out.print("Enter side-b:");
        float sideB = input.nextFloat();

        System.out.print("Enter side-c:");
        float sideC = input.nextFloat();

        float perimeter = sideA + sideB + sideC;
        System.out.println("The perimeter of triangle is " + perimeter);
    }
}
