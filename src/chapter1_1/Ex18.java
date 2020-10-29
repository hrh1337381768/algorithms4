package chapter1_1;

/*
    Print mystery(2, 25) and mystery(3, 11).
    Given positive integers a and b, mystery(a, b).
    Replace + with * and replace return 0 with return 1,
    answer again.
 */
public class Ex18 {
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }
    // (2,25) (4,12)+2 (8,6)+2 (16,3)+2 (32,1)+2+16 (64,0)+2+16+32=50
    // (3,11) (6,5)+3 (12,2)+3+6 (24,1)+3+6 (48,0)+3+6+24=33

    public static int mysteryRe(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mysteryRe(a * a, b / 2);
        return mysteryRe(a * a, b / 2) * a;
    }
    // (4,12)*2 (16,6)*2 (16*16,3)+2 (16pow4,1)*2*16pow2 (16pow8,0)*2*16pow6

    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));

        System.out.println(mysteryRe(2, 25));
//        System.out.println(Math.pow(16,6)*2);
        System.out.println(mysteryRe(3, 11));
    }
}
