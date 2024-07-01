package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        System.out.println("max is " + result);
        return result;
    }
    public static void main(String[] args) {
    max(7, 5);
    max(0, 0);
    max(2, 5);
    }
}
