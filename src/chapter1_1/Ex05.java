package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/*
    Write a code fragment that prints true if the double
    variables x and y are both strictly between 0 and 1
    and false otherwise.
 */
public class Ex05 {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        System.out.println((x > 0 && x < 1) && (y > 0 && y < 1));
    }
}
