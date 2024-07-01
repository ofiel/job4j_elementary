package ru.job4j.condition;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class MaxTest {

    @Test
    void whenLeft7Right5Max7() {
        int left = 7;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft0Right0Max0() {
        int left = 0;
        int right = 0;
        int result = Max.max(left, right);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft2Right5Max5() {
        int left = 2;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}