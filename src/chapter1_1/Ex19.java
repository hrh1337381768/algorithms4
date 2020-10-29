package chapter1_1;

/*
    Develop a better implementation of F(N) and saves
    computed values in an array.
 */
public class Ex19 {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long Fib(int N) {
        if (N == 0) {
            return 0;
        } else {
            int a1 = 1, a2 = 1, a3 = 1;
            for (int i = 0; i < N - 2; i++) {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            }
            return a3;
        }
    }

    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++)
//            System.out.println(N + " " + F(N));
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + Fib(N));
    }
}
