import java.util.Scanner;

public class CalculateTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first angle value: ");
        int angleA = input.nextInt();

        System.out.print("Enter second angle value: ");
        int angleB = input.nextInt();

        System.out.print("Enter third angle value: ");
        int angleC = input.nextInt();

        int sumOfAngles = angleA + angleB + angleC;

        if (sumOfAngles != 180 || angleA <= 0 || angleB <= 0 || angleC <= 0) {
            System.out.println("A triangle can't be built based on the given angle values.");
        } else {
            System.out.println("A triangle can be built based on the given angle values.");

            if (angleA == 60 && angleB == 60 && angleC == 60) {
                System.out.println("Type: Equilateral triangle");
            }

            if (angleA == 90 || angleB == 90 || angleC == 90) {
                System.out.println("Type: Right-angled triangle");
            } else if (angleA > 90 || angleB > 90 || angleC > 90) {
                System.out.println("Type: Obtuse triangle");
            } else {
                System.out.println("Type: Acute triangle");
            }

            if (angleA == angleB || angleB == angleC || angleA == angleC) {
                System.out.println("Type: Isosceles triangle");
            }
        }
    }
}
