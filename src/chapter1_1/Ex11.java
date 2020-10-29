package chapter1_1;

/*
    Write a code fragment that prints the contents of a
    two-dimensional boolean array, using * to represent
    true and a space to represent false. Include row and
    column numbers.
 */
public class Ex11 {
    public static void main(String[] args) {
        boolean[][] a = {
                {true, true, false},
                {true, false, false},
                {false, false, false}
        };
        printBooleanMatrix(a);
    }

    public static void printBooleanMatrix(boolean[][] a) {
        System.out.print("  ");
        for (int col = 0; col < a[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        for (int row = 0; row < a.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] ? "*" : " ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
