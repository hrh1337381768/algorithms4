package chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/*
    Random matches. Write a BinarySearch client that takes an int value T as
    command-line argument and runs T trails of the following experiment for
    N = 10³, 10⁴, 10⁵, 10⁶ : generate two arrays of N randomly generated positive
    six-digit int values, and find the number of values that appear in both
    arrays. Print a table giving the average values of this quantity over the T
    trials for each value of N.
 */
public class Ex39 {
    public static int experiment(int length) {
        int[] a1 = new int[length];
        int[] a2 = new int[length];
        Arrays.sort(a1);
        Arrays.sort(a2);
        int numInBoth = 0;

        for (int i = 0; i < length; i++) {
            // [100000, 1000000)
            a1[i] = StdRandom.uniform(100000, 1000000);
            a2[i] = StdRandom.uniform(100000, 1000000);
        }

        for (int i = 0; i < length; i++) {
            if (i > 0 && a1[i] == a1[i - 1]) {
                continue;
            }
            if (BinarySearch.rank(a1[i], a2) != -1) {
                numInBoth++;
            }
        }
        return numInBoth;
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int n0 = 1000;
        int n1 = 10000;
        int n2 = 100000;
        int n3 = 1000000;

        int[] nums = new int[4];
        for (int i = 0; i < T; i++) {
            nums[0] += experiment(n0);
            nums[1] += experiment(n1);
            nums[2] += experiment(n2);
            nums[3] += experiment(n3);
        }

        System.out.printf("Array.length %40s\n", "Average of values in both arrays");
        System.out.printf("10ˆ3 %30.2f \n", ((double) nums[0]) / T);
        System.out.printf("10ˆ4 %30.2f \n", ((double) nums[1]) / T);
        System.out.printf("10ˆ5 %30.2f \n", ((double) nums[2]) / T);
        System.out.printf("10ˆ6 %30.2f \n", ((double) nums[3]) / T);
    }
}
