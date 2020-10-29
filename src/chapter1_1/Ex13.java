package chapter1_1;

/*
    Write a code fragment to print the transposition(rows and
    columns changed) of a two-dimensional array with M rows
    and N columns.
 */
public class Ex13 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        printTransposedMatrix(a);
    }

    public static void printTransposedMatrix(int[][] a) {
        for (int col = 0; col < a[0].length; col++) {
            for (int row = 0; row < a.length; row++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}
