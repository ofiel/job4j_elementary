package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double debt = amount + (amount * percent) / 100;
        while (debt > 0) {
            for (int i = 0; i < amount; i++) {
                debt -= salary;
                year++;
                break;
            }
        }
        return year;
    }
}
