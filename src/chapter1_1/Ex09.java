package chapter1_1;


import edu.princeton.cs.algs4.StdIn;

/*
   Write a code fragment that puts the binary representation
   of a positive integer N into a String s.
 */
public class Ex09 {
    public static void main(String[] args) {
//        String s = Integer.toBinaryString(N);

        int N = StdIn.readInt();
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
    }
}
