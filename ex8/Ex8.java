package ru.mephi.java.ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.println(s.substring(i, j + 1));
            }
        }
    }

}
