public class SecondLargerstNumber {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 20, 8, 3};

        System.out.println("Second largest number is " + FindSecondLargestNumber(numbers));
    }

    public static int FindSecondLargestNumber(int[] numbers) {
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = number;
            } else if (number > secondLargestNumber && number != largestNumber) {
                secondLargestNumber = number;
            }
        }

        return secondLargestNumber;
    }
}
