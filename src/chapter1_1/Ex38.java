package chapter1_1;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

/*
    Binary search versus brute-force search. Write a program BruteForceSearch
    that uses the brute-force search method and compare its running time on
    your computer with that of BinarySearch for largeW.txt and largeT.txt.
 */
public class Ex38 {
    public static void main(String[] args) {
        In in = new In("./chapter1_1/largeW.txt");
        int[] a = in.readAllInts();
        Arrays.sort(a);
        int key = 126011;

        long start = System.nanoTime();
        System.out.println("BruteForceSearch = " + BruteForceSearch.rank(key, a));
        long end = System.nanoTime();
        System.out.println("Duration: " + (end - start) + " nanoseconds.");

        start = System.nanoTime();
        System.out.println("BinarySearch = " + BinarySearch.rank(key, a));
        end = System.nanoTime();
        System.out.println("Duration: " + (end - start) + " nanoseconds.");
    }
}
