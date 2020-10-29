package chapter1_1;


import edu.princeton.cs.algs4.StdIn;

/*
    Write a program that takes three integer command-line
    arguments and prints equal if all three are equal, and
    not equal otherwise.
 */
public class Ex03 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();

        if (a == b && a == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
