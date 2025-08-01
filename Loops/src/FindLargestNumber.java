public class FindLargestNumber {
    public static void main(String[] args) {
        Integer[] numbers = {32, 15, 12, 200, 55, 150, 180, 132, 75, 122, 42};
        int maxNumber = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("The largest number is: " + maxNumber);
    }
}
