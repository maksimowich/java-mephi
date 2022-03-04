package ru.mephi.java.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex13 {


    public static void main(String[] args) {
        ArrayList<Integer> pickedNumbers = new ArrayList<Integer>();
        ArrayList<Integer> potentialNumbers = new ArrayList<Integer>();
        for (int i = 1; i < 50; i++) potentialNumbers.add(i);
        for (int i = 0; i < 6; i++) {
            pickedNumbers.add(potentialNumbers.remove(getRandomIndex(potentialNumbers.size())));
        }
        Collections.sort(pickedNumbers);
        System.out.println(pickedNumbers);
    }


    public static int getRandomIndex(int sizeOfArray) {
        Random generator = new Random();
        return generator.nextInt(sizeOfArray);
    }
}
