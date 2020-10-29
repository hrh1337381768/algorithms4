package chapter1_1;


import edu.princeton.cs.algs4.StdRandom;

import java.text.DecimalFormat;
import java.util.Arrays;

/*
    Dice simulation. The following code computes the exact probability
    distribution for the sum of two dice:
        int SIDES = 6;
        double[] dist = new double[2*SIDES+1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                 dist[i+j] += 1.0;
        for (int k = 2; k <= 2*SIDES; k++)
            dist[k] /= 36.0;
     The value dist[i] is the probability that the dice sum to k. Run
     experiments to validate this calculation simulating N dice throws,
     keeping track of the frequencies of occurrence of each value when
     you compute the sum of two random integers between 1 and 6. How
     large does N have to be before your empirical results match the
     exact results to three decimal places?
 */
public class Ex35 {
    public static double[] diceSimulation() {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++)
            for (int j = 1; j <= SIDES; j++)
                dist[i + j] += 1.0;
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= 36.0;
        return dist;
    }

    public static double[] diceExperiment(int N) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        int diceOne = 0, diceTwo = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            diceOne = StdRandom.uniform(1, 7);
            diceTwo = StdRandom.uniform(1, 7);
            sum = diceOne + diceTwo;
            dist[sum]++;
        }
        for (int k = 2; k <= 2 * SIDES; k++)
            dist[k] /= N;
        return dist;
    }

    public static void main(String[] args) {
        double[] ds = diceSimulation();
        DecimalFormat df = new DecimalFormat("0.000");
        for (int i = 2; i < ds.length; i++) {
            ds[i] = Double.parseDouble(df.format(ds[i]));
            System.out.println("The simulated probability of " + i + " : " + ds[i]);
        }
        System.out.println();
        for (int N = 10000; N <= 10000000; N += 10000) {
            double[] de = diceExperiment(N);
            for (int i = 2; i < de.length; i++) {
                de[i] = Double.parseDouble(df.format(de[i]));
            }
            if (Arrays.equals(de, ds)) {
                System.out.println("Match N = " + N);
                for (int i = 2; i < de.length; i++) {
                    System.out.println("The experimental probability of " + i + " : " + de[i]);
                }
                break;
            }
        }
    }
}
