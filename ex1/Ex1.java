package ru.mephi.java.ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Integer.toString(n, 2));
        System.out.println(Integer.toString(n, 8));
        System.out.println(Integer.toString(n, 16));
        System.out.println(Double.toHexString(1 / (double) n));
    }

}
