package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'X') {
                count += 1;
                if (count == board[i].length) {
                    result = true;
                    break;
                }

            }

        }
        return result;
    }
}