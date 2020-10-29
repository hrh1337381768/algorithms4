package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/*
    Equal keys. Add to BinarySearch a static method rank()
    that takes a key and a sorted array of int values(some
    of which may be equal) as arguments and returns the
    number of elements that are smaller than the key and a
    similar method count() that returns the number of elements
    equal to the key. Note: if i and j are the values returned
    by rank(key, a) and count(key, a) respectively, then
    a[i..i+j-1] are the values in the array equal to key.
 */
public class Ex29 {
    public static int rank(int key, int[] a) {
        int less = BinarySearch.rank(key, a);
        if (less > 0) {
            while (a[less - 1] == a[less]) {
                less--;
            }
        }
        return less;
    }

    public static int count(int key, int[] a) {
        int less = rank(key, a);
        int count = 1;
        if (less < a.length - 1) {
            while (a[less + 1] == a[less]) {
                count++;
                less++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Key: ");
        int key = StdIn.readInt();
        int[] a = {10, 10, 11, 13, 18, 54, 68, 77, 77, 77, 84, 98, 98, 99};
        if (BinarySearch.rank(key, a) >= 0) {
            System.out.println("The number of elements that smaller than key: " + rank(key, a));
            System.out.println("the number of elements equal to the key: " + count(key, a));
        } else {
            System.out.println("Not found! ");
        }
    }
}
