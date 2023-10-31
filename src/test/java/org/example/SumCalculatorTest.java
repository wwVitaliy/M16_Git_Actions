package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    public static SumCalculator calc;

    @BeforeEach
    void initCalc() {
        calc = new SumCalculator();
    }

    @Test
    void testSumOfOne() {
        assertEquals(1, calc.sum(1));
    }

    @Test
    void testSUmOfThree(){
        assertEquals(6, calc.sum(3));
    }

    @Test
    void testSumOfZero(){
        assertThrows(IllegalArgumentException.class,
                () -> {
            calc.sum(0);
                });
    }

}