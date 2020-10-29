package chapter1_1;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in1 = new In("./chapter1_1/tinyW.txt");
        int[] whitelist = in1.readAllInts();
        Arrays.sort(whitelist);
        In in2 = new In("./chapter1_1/tinyT.txt");
        while (in2.hasNextLine()) {
            int key = Integer.parseInt(in2.readLine());
            if (rank(key, whitelist) < 0) {
                // print if not in whitelist
                System.out.println(key);
            }
        }
    }
}
