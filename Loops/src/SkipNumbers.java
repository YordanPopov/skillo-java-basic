public class SkipNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int number : numbers) {
            if (number % 3 == 0) {
                continue;
            } else {
                System.out.print(number + " ");
            }
        }
    }
}
