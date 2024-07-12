package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TurnTest {

    @Test
    void backEven() {
        int[] array = {2, 4, 6, 8, 10};
        int[] result = Turn.back(array);
        int[] expected = {10, 8, 6, 4, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void backNotEven() {
        int[] array = {1, 3, 5, 7, 9, 11};
        int[] result = Turn.back(array);
        int[] expected = {11, 9, 7, 5, 3, 1};
        assertThat(result).containsExactly(expected);
    }
}