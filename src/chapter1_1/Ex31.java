package chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/*
    Random connections. Write a program that takes as
    command-line arguments an integer N and a double
    value p (between 0 and 1), plots N equally spaced
    dots of size 0.05 on the circumference of a circle,
    and then, with probability p for each pair of points,
    draws a gray line connecting them.
 */
public class Ex31 {
    public static void drawRandomConnection(int N, double p) {
        StdDraw.setCanvasSize(666, 666);
        // Default scale: left bottom(0, 0) => right top(1, 1)
        StdDraw.setScale(-2.0, 2.0);
        StdDraw.setPenRadius(0.02);

        double[][] points = new double[N][2];
        for (int i = 0; i < N; i++) {
            points[i][0] = Math.cos(2 * Math.PI * i / N);
            points[i][1] = Math.sin(2 * Math.PI * i / N);
            StdDraw.point(points[i][0], points[i][1]);
        }

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // bernoulli: true with probability p
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }
        }

    }

    public static void main(String[] args) {
        // command-line arguments
        int N = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        if (p < 0 || p > 1) {
            System.out.println("Invalid input!");
            return;
        }
        drawRandomConnection(N, p);
    }
}
