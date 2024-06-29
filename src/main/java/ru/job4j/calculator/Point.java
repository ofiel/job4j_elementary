package ru.job4j.calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(-4, 5, 5, -4);
        System.out.println("result1 (-4, 5) to (5, -4) " + result1);
        double result2 = Point.distance(6, 8, 10, 12);
        System.out.println("result2 (6, 8) to (10, 12) " + result2);
        double result3 = Point.distance(5, 10, 15, 20);
        System.out.println("result3 (5, 10) to (15, 20) " + result3);
    }
}
