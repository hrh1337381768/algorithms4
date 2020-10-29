package chapter1_1;

/*
    Sorting three numbers. Suppose that the variables a, b, c and t
    are all the same numeric primitive type. Show that the following
    code puts a, b and c in ascending order:
 */
public class Ex26 {
    public static void sort(int a, int b, int c) {
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        int a = 28, b = 312, c = 99;
        System.out.println(a + " " + b + " " + c);
        sort(a, b, c);
    }
}
