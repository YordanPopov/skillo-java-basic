public class PrintElements {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {8, 7, 6, 5}
        };

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println(numbers[row][col]);
            }
        }
    }
}
