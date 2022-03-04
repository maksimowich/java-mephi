package ru.mephi.java.ex7;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Short.MAX_VALUE);
        short a = scanner.nextShort();
        short b = scanner.nextShort();
        System.out.println(Short.toUnsignedInt((short) (a + b)));
        System.out.println(Short.toUnsignedInt((short) (a - b)));
        System.out.println(Short.toUnsignedInt((short) (a * b)));
        System.out.println(Short.toUnsignedInt((short) (a / b)));
        System.out.println(Short.toUnsignedInt((short) (a % b)));
    }

}
