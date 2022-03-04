package ru.mephi.java.ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        String s =  new Scanner(System.in).nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) + 0 >= 128) {
                System.out.print(s.charAt(i));
                System.out.println(" " + (s.charAt(i) + 0));
            }
        }
    }
}
