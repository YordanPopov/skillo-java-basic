public class AverageOfNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        double totalSum = 0.0d;

        for (int number : numbers) {
            totalSum += number;
        }

        double average = totalSum / numbers.length;
        System.out.printf("The average of numbers is: %.2f", average);
    }
}
