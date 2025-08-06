public class PrintSum {
    public static void main (String[] args) {
        int[] numbers = { 1, 2, 3, 5, 6, 7, 8};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
