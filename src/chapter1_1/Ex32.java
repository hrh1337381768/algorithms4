package chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdStats;

/*
    Histogram. Suppose that the standard input stream
    is a sequence of double values. Write a program that
    takes an integer N and two double values l and r from
    the command line and uses StdDraw to plot a histogram
    of the count of the numbers in the standard input stream
    that fall in each of the N intervals defined by dividing
    (l, r) into N equal-sized intervals.
 */
public class Ex32 {
    public static void histogram(double[] values, int N, double l, double r) {
        int[] counts = new int[N];

        double step = (r - l) / N;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= l && values[i] <= r) {
                for (int j = 0; j < N; j++) {
                    if (values[i] > l + step * j && values[i] <= l + step * j + step) {
                        counts[j]++;
                    }
                }
            }
        }
        int max = StdStats.max(counts);
        for (int i = 0; i < N; i++) {
            double x = (1.0 * i + 0.5) / N;
            double y = counts[i] / (max * 2.0);
            double rw = 0.4 / N;
            StdDraw.filledRectangle(x, y, rw, y);
        }
    }

    public static void main(String[] args) {
        double values[] = new In("./chapter1_1/largeW.txt").readAllDoubles();
        // 1000 10000 1000000
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]),
                r = Double.parseDouble(args[2]);
        histogram(values, N, l, r);
    }
}
