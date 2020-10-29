package chapter1_1;


import edu.princeton.cs.algs4.StdIn;

/*
    Write a program that reads in lines from standard input
    with each line containing a name and two integers and
    then use printf() to print a table with a column of the
    names, the integers, and the result of dividing the first
    by the second, accurate to three decimal places. You should
    use a program like this to tabulate batting averages for
    baseball players or grades for students.
 */
public class Ex21 {
    public static void main(String[] args) {
        System.out.print("Please input the number: ");
        int num = StdIn.readInt();
        String[] names = new String[num];
        int[] integers1 = new int[num];
        int[] integers2 = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1 + ": ");
            names[i] = StdIn.readString();
            integers1[i] = StdIn.readInt();
            integers2[i] = StdIn.readInt();
        }
        System.out.println("==================================");
        for (int i = 0; i < num; i++) {
            System.out.printf("|%6s|%8d|%8d|%8.3f|\n", names[i],
                    integers1[i], integers2[i], (float) integers1[i] / integers2[i]);
        }
        System.out.println("==================================");
    }
}
