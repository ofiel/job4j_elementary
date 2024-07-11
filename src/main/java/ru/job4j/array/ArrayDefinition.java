package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Petr Arsentev";
        names[1] = "Matrosova Lyubov";
        names[2] = "Akakiv Akakiy";
        names[3] = "Ivanov Ivan";
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        for (int i = 0; i <= 4; i++) {
            System.out.println(names[i]);
        }
    }
}
