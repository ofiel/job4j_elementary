package ru.job4j.calculator;

public class Fit {

    private static final double COEFFICIENT = 1.15;
    private static final int MAN_BASE_HEIGHT = 100;
    private static final int WOMAN_BASE_HEIGHT = 110;

    public static double manWeight(short height) {
        double result = (height - MAN_BASE_HEIGHT) * COEFFICIENT;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - WOMAN_BASE_HEIGHT) * COEFFICIENT;
        return result;
    }

    public static void main(String[] args) {
        short heightW = 170;
        short heightM = 180;
        double woman = Fit.womanWeight(heightW);
        double man = Fit.manWeight(heightM);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
