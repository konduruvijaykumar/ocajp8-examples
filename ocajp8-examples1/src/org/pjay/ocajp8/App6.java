package org.pjay.ocajp8;

public class App6 {

    public static void main(String[] args) {

        int int1 = 1+2*3;
        int int2 = (1+2)*3;
        System.out.println("int1 " + int1);
        System.out.println("int2 " + int2);

        boolean boolean1 = true || true && false;
        boolean boolean2 = (true || true) && false;
        System.out.println("boolean1 " + boolean1);
        System.out.println("boolean2 " + boolean2);

        int x = 4;
        int y = 4;
        // Note: Important Please verify
        // pre and post unary operators are taking same precedence, hence it is evaluated below with left to right instead post being first
        int result1 = x++ + --x + ++x + x--;
        int result2 = y-- + ++y + --y + y++;
        System.out.println("x " + x);
        System.out.println("result1 " + result1);
        System.out.println("y " + y);
        System.out.println("result2 " + result2);

        boolean b1 = false, b2 = true;
        System.out.println("!b1 "+!b1);
        System.out.println("b1 "+b1);

        int i = 4<<4/2;
        System.out.println("i " + i);
    }

}
