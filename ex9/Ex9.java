package ru.mephi.java.ex9;

import java.util.Locale;

public class Ex9 {

    public static void main(String[] args) {
        String s = "WORLD".toLowerCase(Locale.ROOT);
        System.out.println(s);
        String t = "world";
        System.out.println(t);
        System.out.println(s.equals(t));
        System.out.println(s != t);
    }

}
