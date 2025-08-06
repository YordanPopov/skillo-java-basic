public class FindBiggestElement {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 10, 1, 80, 1000};
        int greaterNumeber = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > greaterNumeber) {
                greaterNumeber = number;
            }
        }

        System.out.println(greaterNumeber);
    }
}
