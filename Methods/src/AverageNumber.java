public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30};
        System.out.println("Average is: " + ComputeAverageNumber(numbers));
    }

    public static double ComputeAverageNumber(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
