package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num) && num != 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("Четное? " + isEven(4));
        System.out.println("Не четное? " + notEven(7));
        System.out.println("Положительное? " + isPositive(4));
        System.out.println("Отрицательное? " + notPositive(-4));
        System.out.println("Нечетное и положительное? " + notEvenAndPositive(7));
        System.out.println("Четное или отрицательное? " + evenOrNotPositive(-4));
    }
}
