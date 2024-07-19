package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 0;
        int[] result = new int[2];
        while (i < array.length - 1) {
                j++;
            if (array[i] + array[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            }
            if (j == array.length - 1) {
                j = i + 1;
                i++;
            }
    }
        return new int[0];
    }
}
