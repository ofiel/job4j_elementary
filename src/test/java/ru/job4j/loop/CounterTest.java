package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus4ToT2ThenMinus4() {
        int start = -4;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = -4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom2To2Then2() {
        int start = 2;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}