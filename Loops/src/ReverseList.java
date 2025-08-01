public class ReverseList {
    public static void main (String[] args) {
        Integer[] numbers =  {10, 20, 30, 40, 50};

        for (int index = numbers.length - 1; index >= 0 ; index--) {
            System.out.print(numbers[index] + " ");
        }
    }
}
