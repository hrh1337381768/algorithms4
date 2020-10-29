package chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

/*
    Bad shuffling. Suppose that you choose a random integer between
    0 and N-1 in our shuffling code instead of one between i and N-1.
    Show that the resulting order is not equally likely to be one of
    the N! possibilities. Run the test of the previous exercise for
    the version.
 */
public class Ex37 {
    public static void badShuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // [0, N-1)
            int r = StdRandom.uniform(N);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static int[][] ShuffleTest(int M, int N) {
        double[] a = new double[M];
        int[][] table = new int[M][M];
        for (int i = 0; i < N; i++) {
            initializeArray(a);
            badShuffle(a);
            for (int j = 0; j < M; j++) {
                table[(int) a[j]][j]++;
            }
        }
        return table;
    }

    public static void initializeArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
    }

    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int[][] table = ShuffleTest(M, N);
        // Print table
        System.out.println("TABLE");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%4d  ", i);
            for (int j = 0; j < table[0].length; j++) {
                System.out.printf("%4d ", table[i][j]);
            }
            System.out.println();
        }
    }
}
