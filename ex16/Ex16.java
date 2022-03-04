package ru.mephi.java.ex16;

public class Ex16 {

    public static void main(String[] args) {
        System.out.println(average(1, 23 , 22.0));
    }


    public static double average(double first, double... rest) {
        double sum = first;
        for (double v : rest) sum += v;
        return sum / (1 + rest.length);
    }

}
