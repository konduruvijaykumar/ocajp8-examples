package org.pjay.ocajp8;

public class App1 {

    // This code demonstrates the how compiler chooses the appropriate overloaded method in case of ambiguity
    // Below are the rules performed in order on by one, until the issue is solved. if not solved throws compiler error
    // Rule 1) does not consider autoboxing, unboxing and varargs
    // Rule 2) consider autoboxing, unboxing and still ignoring varargs
    // Rule 3) consider autoboxing, unboxing and varargs
    // If all above rules in the order does not help in solving, compilation error thrown
    // In here the order of methods are chosen by compiler is depicted with priority - 1 etc.
    // If no method with higher priority than the method present, then that method will be cosen to execute
    public static void main(String[] args) {
        App1 app1 = new App1();
        short s1 = 1, s2 = 2;
        int sum = app1.calculate(s1, s2);
        System.out.println("sum " + sum);
    }

    // Priority -- 4
    private int calculate(short... args){
        System.out.println("Calculating the sum of two short arguments");
        return args[0] + args[1];
    }

    // Priority -- 3
    private int calculate(Short s1, Short s2){
        System.out.println("Calculating the sum of two Short arguments");
        //return Short.valueOf(s1)+Short.valueOf(s2);
        return s1+s2;
    }

    // Priority -- 1
    private int calculate(int i1, int i2){
        System.out.println("Calculating the sum of two int arguments");
        return i1+i2;
    }

    // Priority -- 2
    private int calculate(long lng1, long lng2){
        System.out.println("Calculating the sum of two long arguments");
        return (int)(lng1+lng2);
    }

}
