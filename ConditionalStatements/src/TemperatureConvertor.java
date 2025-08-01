import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Enter a temperature: ");
        double temp = userInput.nextDouble();

        System.out.println("Enter [1] to convert from Celsius to Fahrenheit.");
        System.out.println("Enter [2] to convert from Fahrenheit to Celsius.");
        int userChoice = userInput.nextInt();

        switch (userChoice) {
            case 1:
                celsius = temp;
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
                break;
            case 2:
                fahrenheit = temp;
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
