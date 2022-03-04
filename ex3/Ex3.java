package ru.mephi.java.ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(getMaxValue1(a, b, c));
        System.out.println(getMaxValue2(a, b, c));
    }

    public static int getMaxValue1(int... values) {
        //     if (values.length == 0)  return 0;
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int getMaxValue2(int... values) {
        //   iffffffffff
        int maxValue = values[0];
        for (int value : values) maxValue = Math.max(value, maxValue);
        return maxValue;
    }

}
