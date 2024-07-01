package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus45to5Minus4then12Dot727() {
        double expected = 12.727;
        int x1 = -4;
        int y1 = 5;
        int x2 = 5;
        int y2 = -4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when68to1012then5Dot656() {
        double expected = 5.656;
        int x1 = 6;
        int y1 = 8;
        int x2 = 10;
        int y2 = 12;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when510to1520then14Dot142() {
        double expected = 14.142;
        int x1 = 5;
        int y1 = 10;
        int x2 = 15;
        int y2 = 20;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}