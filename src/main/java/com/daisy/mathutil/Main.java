package com.daisy.mathutil;

import com.daisy.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

          //TDD - Viết code bắt đầu tù viết test
            testFactorialGivenValidN5ReturnWell120();
    }

    //test hàm tính giai thừa n = 5 và hy vọng trả về 120, thực tế đoán xem
    public static void testFactorialGivenValidN5ReturnWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);

        System.out.println("Check 5! | expected: "
                + expected + " | actual: " + actual);
    }

    //để test cose base, thì đc gọi là test script
    //code này về lý thuyet ko cần ship cho KH
}
