package com.daisy.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.daisy.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //test case 4: test hàm với đầu vào ko hợp lệ, n = -1
    //hy vọng trả về ngoai le!!! IllegalArgumentException
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> {getFactorial(-1);});
    }


    //test case 3: test hàm với đầu vào hợp lệ, n = 1
    //hy vọng trả về 0
    @Test
    void testFactorialGivenValidN0ReturnWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);

        assertEquals(expected, actual);
    }


    //test case 2: test hàm với đầu vào hợp lệ, n = 6
    //hy vọng trả về 720
    @Test
    void testFactorialGivenValidN6ReturnWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);

        assertEquals(expected, actual);
    }

    //test case 1: test hàm với đầu vào hợp lệ, n = 5
    //hy vọng trả về 120
    @Test
    void testFactorialGivenValidN5ReturnWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);

        //so sánh tự động giúp tui expected có == actual hay ko
        // nếu == màu xanh
        // nếu != màu đỏ

        assertEquals(expected, actual);
    }
}

