package chapter1_1;

import java.util.Arrays;

/*
    Write a static program histogram() that takes an array a[]
    of int values and an integer M as arguments and returns an
    array of length M whose its entry is the number of times
    the integer i appeared in the argument array. If the values
    in a[] are all between 0 and M-1, the sum of the values in
    the returned array should be equal to a.length.
 */
public class Ex15 {
    public static int[] histogram(int[] a, int M) {
        int[] returned = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] < M) {
                returned[a[i]]++;
            }
        }
        return returned;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 2, 6, 7, 1};
        int[] returned = histogram(a, 8);
        System.out.println(Arrays.toString(returned));
    }
}
