package chapter1_1;

import edu.princeton.cs.algs4.StdIn;

/*
    Matrix library: Write a library Matrix that implements the
    following API:
    public class Matrix
        static double dot(double[] x, double[] y): vector dot product
        static double[][] mult(double[][] a, double[][] b): matrix-matrix product
        static double[][] transpose(double[][] a): transpose
        static double[] mult(double[][] a, double[] x): matrix-vector product==
        static double[] mult(double[] y, double[][] a): vector-matrix product
 */
public class Ex33 {
    public static class Matrix {
        static double dot(double[] x, double[] y) {
            double dot = 0;
            if (x.length == y.length) {
                for (int i = 0; i < x.length; i++) {
                    dot += x[i] * y[i];
                }
                return dot;
            } else {
                throw new IllegalArgumentException();
            }
        }

        static double[][] mult(double[][] a, double[][] b) {
            double[][] tb = transpose(b);
            int min = Math.min(a.length, a[0].length);
            double[][] result = new double[min][min];
            for (int i = 0; i < min; i++) {
                for (int j = 0; j < min; j++) {
                    result[i][j] = dot(a[i], tb[j]);
                }
            }
            return result;
        }

        static double[][] transpose(double[][] a) {
            double[][] trans = new double[a[0].length][a.length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    trans[j][i] = a[i][j];
                }
            }
            return trans;
        }

        static double[] mult(double[][] a, double[] x) {
            if (a[0].length == x.length) {
                double[] result = new double[a.length];
                for (int i = 0; i < a.length; i++) {
                    result[i] = dot(x, a[i]);
                }
                return result;
            } else {
                throw new IllegalArgumentException();
            }
        }

        static double[] mult(double[] y, double[][] a) {
            if (y.length == a.length) {
                double[][] trans = transpose(a);
                double[] result = new double[trans.length];
                for (int i = 0; i < trans.length; i++) {
                    result[i] = dot(y, trans[i]);
                }
                return result;
            } else {
                throw new IllegalArgumentException();
            }
        }

        static double[][] getMatrix() {
            System.out.print("Enter x, y of x-by-y matrix: ");
            int x = StdIn.readInt(),
                    y = StdIn.readInt();
            double[][] matrix = new double[x][y];
            for (int i = 0; i < x; i++) {
                System.out.print("Enter " + i + " line: ");
                for (int j = 0; j < y; j++) {
                    matrix[i][j] = StdIn.readDouble();
                }
            }
            return matrix;
        }

        static void printMatrix(double[][] matrix) {
            for (double[] row : matrix) {
                for (double col : row) {
                    System.out.print(col + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        double[] x = {2.0, 3.0, 4.0};
        double[] y = {3.0, 2.0, 5.5};
        double dot = Matrix.dot(x, y);
        System.out.println("dot = " + dot);

//        double[][] mat1 = Matrix.getMatrix();
//        Matrix.printMatrix(mat1);
//        double[][] mat2 = Matrix.getMatrix();
//        Matrix.printMatrix(mat2);
//        System.out.println();
//        double[][] mult = Matrix.mult(mat1, mat2);
//        Matrix.printMatrix(mult);

        double[][] mat = {
                {13, 9, 7, 15},
                {8, 7, 4, 6},
                {6, 4, 0, 3}
        };
        double[][] trans = Matrix.transpose(mat);
        Matrix.printMatrix(trans);

        double[] vec1 = {3, 4, 2};
        double[] mult1 = Matrix.mult(vec1, mat);
        for (double v : mult1) {
            System.out.print(v + " ");
        }
        System.out.println();

        double[] vec2 = {4, 3, 2, 1};
        double[] mult2 = Matrix.mult(mat, vec2);
        for (double v : mult2) {
            System.out.print(v + " ");
        }
    }
}
