package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void whenSumX5toY6Then11() {
        int y = 6;
        int extended = 11;
        int rsl = Calculator.sum(y);
        assertThat(rsl).isEqualTo(extended);
    }

    @Test
    void whenX5Y6ThenMultiply30() {
        int y = 6;
        Calculator calculator = new Calculator();
        int extended = 30;
        int rsl = calculator.multiply(y);
        assertThat(rsl).isEqualTo(extended);
    }

    @Test
    void whenY9X5ThenMinus4() {
        int y = 9;
        int extended = 4;
        int rsl = Calculator.minus(y);
        assertThat(rsl).isEqualTo(extended);
    }

    @Test
    void whenY12X6ThenDivide2() {
        int y = 10;
        Calculator calculator = new Calculator();
        int extended = 2;
        int rsl = calculator.divide(y);
        assertThat(rsl).isEqualTo(extended);
    }

    @Test
    void whenY6X5ThenSumAllOperation72() {
        int y = 10;
        Calculator calculator = new Calculator();
        int extended = 72;
        int rsl = calculator.sumAllOperation(y);
        assertThat(rsl).isEqualTo(extended);
    }
}