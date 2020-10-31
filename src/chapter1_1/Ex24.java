package chapter1_1;

/*
    Give the sequence of values of p and q that are
    computed when Euclid's algorithm is used to compute
    the greatest common divisor of 105 and 24. Extend
    the given code to develop a program Euclid that takes
    two integers from the command line and computes their
    gcd, printing out the two arguments for each call on
    the recursive method. Use your program to compute the
    gcd of 1111111 and 1234567.
 */
public class Ex24 {

//    Ex25: a=kb+r => r=a-kb => r=a1d-kb1d=(a1-kb1)d
//          a=a1d, b=b1d, d is a common divisor of a and b
//          So: gcd(a, b) = gcd(b, a % b)

    public static int euclid(int p, int q) {
//        System.out.println("p = " + p + ", q = " + q);
        if (q == 0) return p;
        if (p == 0) return q;
        if (p < q) {
            int temp = p;
            p = q;
            q = temp;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }

    public static void main(String[] args) {
        System.out.println(euclid(105, 24));
        System.out.println(euclid(1111111, 1234567));
    }
}
