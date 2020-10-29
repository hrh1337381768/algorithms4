package chapter1_1;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Remove duplicates. Modify the test client in BinarySearch
    to remove any duplicate keys in the whitelist after the sort.
 */
public class Ex28 {
    public static void main(String[] args) {
        int[] whitelist = new In("./chapter1_1/tinyT.txt").readAllInts();
        // sort and print
        Arrays.sort(whitelist);
        for (int i : whitelist) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // remove duplicates
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < whitelist.length - 1; i++) {
            if (whitelist[i] != whitelist[i + 1]) {
                list.add(whitelist[i]);
            }
        }
        list.add(whitelist[whitelist.length - 1]);
        for (Integer integer : list) {
            System.out.print(integer + ", ");
        }
    }
}
