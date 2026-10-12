package com.daisy.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTest {
        //chuan bi rieng data test ra 1 cho - DDT - Data Driven Testing
        public static Object[][] initTestData() {
            Object[][] testData = {
                    {0, 1},
                    {1, 1},
                    {2, 2},
                    {3, 6},
                    {4, 24},
                    {5, 120}
            };
            return testData;
        }

        //test ne, nhoi data o tren vao ham assertEquals()
        @ParameterizedTest //sanh ngang vai voi DDT
        @MethodSource("initTestData")
        public void testFactorialGivenValidNRunsWell(int n, long expected) {
            assertEquals(expected, MathUtil.getFactorial(n));
        }

}