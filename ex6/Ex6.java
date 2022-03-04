package ru.mephi.java.ex6;

import java.math.BigInteger;

public class Ex6 {

    public static void main(String[] args) {
        System.out.println(getFactorial(1000));
    }

    public static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
