package chapter1_1;

/*
    Write a static method lg() that takes an int value N as
    argument and returns the largest int not larger than base-2
    logarithm of N. Do not use Math.
 */
public class Ex14 {
    public static void main(String[] args) {
        int N = 99;
        System.out.println(lg(N));
    }

    public static int lg(int N) {
        int inc = 0;
        for (int i = N; i > 0; i /= 2) {
            inc++;
        }
        return inc-1;
    }
}
