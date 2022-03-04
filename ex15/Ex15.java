package ru.mephi.java.ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            triangle.add(new ArrayList<Integer>());
            triangle.get(i).add(0, 1);
            triangle.get(i).add(triangle.get(i).size(), 1);
            for (int j = 1; j < i; j++) {
                triangle.get(i).add(j , triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
        }
        System.out.println(triangle);
    }
}
