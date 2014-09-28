package org.edu.getjavajob.lesson09;

import java.util.Arrays;

/**
 * @author Alex
 * @since 28.09.14
 */
public class SolvePairs {
    private static final int SUMM = 100;

    public static void main(String[] args) {
        int[] values = new int[]{2, 98, -1, 101, 34534534, 234234, 50, 49, 51};
        Arrays.sort(values);

        //-1 49 51 99 101 1000

        int i = 0;
        int j = values.length - 1;

        while (j > i) {
            int summ = values[i] + values[j];
            if (summ == SUMM) {
                System.out.println(String.format("Pair found: %d/%d", values[i], values[j]));
                i++;
                j--;
            } else if (summ > SUMM) {
                j--;
            } else {
                //summ < SUMM
                i++;
            }
        }
    }
}
