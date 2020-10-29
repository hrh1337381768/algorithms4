package chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/*
    Add to the BinarySearch test client the ability to
    respond to a second argument: + to print numbers from
    standard input that are not in the whitelist, - to
    print numbers that are in the whitelist.
 */
public class Ex23 {
    public static void main(String[] args) {
//        Edit run configuration -> Program arguments -> ..\path\tinyT.txt
//        int[] whitelist = In.readInts(args[0]);
        int[] whitelist = new In("./chapter1_1/tinyT.txt").readAllInts();
        Arrays.sort(whitelist);
        System.out.print("Choose an argument '+' or '-': ");
        char arg = StdIn.readChar();
        int[] a = {1, 2, 35, 45, 10, 11, 68};
        for (int i = 0; i < a.length; i++) {
            if (Ex22.rank(a[i], whitelist) < 0 && arg == '+') {
                System.out.print(a[i] + " ");
            } else if (Ex22.rank(a[i], whitelist) > 0 && arg == '-') {
                System.out.print(a[i] + " ");
            }
        }
    }
}
