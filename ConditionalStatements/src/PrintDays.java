import java.util.Scanner;

public class PrintDays {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter valid day [1-7]: ");
        int day = userInput.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + day + "nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + day + "rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + day + "th day of the week is Thursday");
                break;
            case 5:
                System.out.println("The " + day + "th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + day + "th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + day + "th day of the week is Sunday");
                break;
            default:
                System.out.println("I said valid day!!!");
        }
    }
}
