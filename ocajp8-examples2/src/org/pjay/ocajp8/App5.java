package org.pjay.ocajp8;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class App5 {

    public static void main(String[] args) {
        // Numeric overflow, even underflow can happen when value is lowe than lowest
        System.out.println(MAX_VALUE+1);
        System.out.println(2147483647 +1);

        // Numeric underflow
        System.out.println(MIN_VALUE-1);
        System.out.println(-2147483648-1);

        // Note: Confusing, as when using without variable(only numerals in expression) on a arithmetic operations, no compilation issue
        short x = 3;
        short y = 10;
        // Incompatible types. Found: 'int', required: 'short'
        //short z = x*y;
        short z = (short) (x*y);
        System.out.println("z "+z);
        short j = 3*10;
        System.out.println("j "+j);
    }

}
