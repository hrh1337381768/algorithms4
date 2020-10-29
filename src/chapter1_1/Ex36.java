package chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

/*
    Empirical shuffle check. Run computational experiments to check that
    our shuffling code on 1.1.10 works as advertised. Write a program
    ShuffleTest that takes command-line arguments M and N, does N shuffles
    of an array of size M that is initialized with a[i] = i before each shuffle,
    and prints an M-by-M table such that row i gives the number of times i wound
    up in position j for all j. All entries in the array should be close to N/M.
 */
public class Ex36 {
    public static void shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // [i, N-1)
            int r = i + StdRandom.uniform(N - i);
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
            shuffle(a);
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
