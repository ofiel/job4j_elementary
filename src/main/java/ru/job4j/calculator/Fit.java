package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
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
