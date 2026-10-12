package com.daisy.mathutil.core;


public class MathUtil {

    public static long getFactorial(int n) {
        long result = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20");

        }
        // n đang ổn, làm vòng for
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        return result;
    }


    // code chính, cose base, code dân dev phải
}
