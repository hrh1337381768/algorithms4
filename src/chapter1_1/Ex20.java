package chapter1_1;

/*
    Write a recursive static method that computes the
    value of ln(N!).
 */
public class Ex20 {
    // ln(N!) = ln(N)+ln(N-1)+...+ln1
    public static double ln(int N) {
        if (N == 1) return 0;
        return Math.log(N) + ln(N - 1);
    }

    public static void main(String[] args) {
        System.out.println(ln(2));
    }
}
