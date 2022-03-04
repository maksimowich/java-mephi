package ru.mephi.java.dop;

import java.util.ArrayList;
import java.util.Arrays;


public class Dop {
    public static void main(String[] args) {
        int[] values = {1, 1, 0, 1, 1, 2};
        System.out.println(getSecondMax(values));
    }

    public static int getSecondMax(int[] values) {
        int max = Integer.MIN_VALUE;
        int predMax = Integer.MIN_VALUE;
        boolean flag = true;
        for (int i = 1; i < values.length; i ++) {
            if (values[i] > max) {
                predMax = max;
                max = values[i];
            }
            else if (values[i] < max && values[i] > predMax) {
                predMax = values[i];
            }
        }
        return predMax;
    }
}
