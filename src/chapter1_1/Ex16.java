package chapter1_1;

/*
    Give the value of exR1(6);
 */
public class Ex16 {
    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
        // exR1(3)+6+exR1(4)+6
        // exR1(0)+3+exR1(1)+3+6+exR1(1)+4+exR1(2)+4+6
        // 311361142246
    }

    public static void main(String[] args) {
        System.out.println(exR1(6));
    }
}
