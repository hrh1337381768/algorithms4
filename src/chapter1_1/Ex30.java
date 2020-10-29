package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/*
    Array exercise. Write a code fragment that creates
    an N-by-N boolean array a[][] such that a[i][j] is
    true if i and j are relatively prime(have no common
    factors => only 1), and false otherwise.

 */
public class Ex30 {
    private static int relativelyPrime(int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (i < j) {
            int temp = i;
            i = j;
            j = temp;
        }
        if (i % j == 0) {
            return j;
        } else {
            return relativelyPrime(j, i % j);
        }
    }

    public static void main(String[] args) {
        System.out.print("N-by-N array: ");
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = relativelyPrime(i, j) == 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
