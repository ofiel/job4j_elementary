package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i <= number; i++) {
            if (number > 1 && (number % i) != 0 && number == i) {
                prime = true;
                break;
            }
            prime = false;
        }
        return prime;
    }
}
