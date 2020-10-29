package chapter1_1;

/*
    Write a version of BinarySearch that uses the given
    recursive rank() and traces the method calls.
    Each time the recursive method is called, print the
    argument values lo and hi, indented by the depth of
    the recursion. Hint: Add an argument to the recursive
    method that keeps track of the depth.
 */
public class Ex22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

//    public static int rank(int key, int[] a) {
//        return rank(key, a, 0, a.length - 1, 0);
//    }

    public static int rank(int key, int a[], int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1);
        else if (key > a[mid])
            return rank(key, a, mid + 1, hi);
        else
            return mid;
    }

    public static int rank(int key, int a[], int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("   ");
        }
        System.out.println("lo = " + lo + ", hi = " + hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid])
            return rank(key, a, mid + 1, hi, depth + 1);
        else
            return mid;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 6, 8, 9, 20, 34};
        int position = rank(34, a);
        if (position == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Position = " + position);
        }
    }
}
