package ru.mephi.java.ex2;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println(getNormalizedAngle1(-1));
        System.out.println(getNormalizedAngle2(-500));
    }

    public static int getNormalizedAngle1(int angle) {
        return (angle % 360 + 360) % 360;
    }

    public static int getNormalizedAngle2(int angle) {
        return Math.floorMod(angle, 360);
    }

}
