//2. Create a 3x4 (3 rows 4 cols) array and print the values in it using enhanced for loop.

  public class TwoDArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

/*output : 1 2 3 4
           5 6 7 8
           9 10 11 12 */
