public class SmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {1, -1, 0};
        System.out.println("The smallest number is: " + FindSmallestNumber(numbers));
    }

    public static int FindSmallestNumber(int[] numbers) {
        int smallestNumber = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        return smallestNumber;
    }
}
