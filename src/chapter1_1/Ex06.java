package chapter1_1;

/*
    Print it.
 */
public class Ex06 {
    public static void main(String[] args) {
        int f = 1;
        int g = 1;
        for(int i = 0; i <= 15; i++) {
            // 1 2 3 5 8 13 ..
            System.out.println(f);
            f = f + g;  // 2 3 5 8 13 ..
            g = f - g;  // 1 2 3 5 8 ..
        }
    }
}
