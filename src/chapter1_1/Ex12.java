package chapter1_1;

/*
    Print it.
 */
public class Ex12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i; // a[0]9 a[1]8 .. a[9]0
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]]; // a[0]0 a[1]1 .. a[9]9
        for (int i = 0; i < 10; i++)
            System.out.println(i); // 0 1 2 3
    }
}
