package com.daisy.mathutil.core;


public class MathUtil {

    public static long getFactorial(int n) {

        //ĐỔI HÀM TÍNH THEO ĐỆ QUY - RECUSION
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if (n == 0 || n == 1) {
            return 1; //điểm dừng đệ quy, ko lùi nữa, lùi đến 1 là tính đc
        }

        //tính đc n! = (n-1)! x n
        return n * getFactorial(n - 1);

        //TỐI ƯU, TINH CHỈNH CODE CHO NÓ HAY HƠN, ỔN HƠN (THUẬT TOÁN CHẠY NHANH HƠN)
        //VIỆC CHỈNH CODE ĐỂ TỐT HƠN GỌI LÀ REFACTOR/REFACTORING

        

//        long result = 1;
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20");
//
//        }
//        // n đang ổn, làm vòng for
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
    }


    // code chính, cose base, code dân dev phải
}
