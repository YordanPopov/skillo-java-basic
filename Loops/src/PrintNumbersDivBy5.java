public class PrintNumbersDivBy5 {
    public static void main(String[] args) {
        Integer[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int number : numbers) {
            if (number > 150) {
                break;
            }

            if (number % 5 == 0) {
                System.out.println(number);
            }
        }
    }
}
