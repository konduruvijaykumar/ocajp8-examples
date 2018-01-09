package org.pjay.ocajp8;

public class App5 {

    public static void main(String[] args) {

        // Decimal numerals (10)
        byte b1 = 78;
        System.out.println("b1 " + b1);
        // Incompatible types. Found: 'double', required: 'byte'
        //byte b2 = 9.0;
        byte b3 = (6+9)/3;
        // Incompatible types. Found: 'long', required: 'byte'
        //byte b4 = 6L;
        // binary numerals
        byte b5 = 0b1111111;//0b01;0b101;
        System.out.println("b5 " + b5);
        // Incompatible types. Found: 'int', required: 'byte'
        //byte b6 = 0b11111111;
        // Octal numerals
        byte b7 = 067;
        System.out.println("b7 " +b7);
        // Hexa-decimal numerals
        byte b8 = 0X3D;//0xa;//0X1F;//0xF;
        System.out.println("b8 " + b8);
        // Incompatible types. Found: 'int', required: 'byte'
        //byte b9 = 0xAF;


        short s1 = 789;
        // Incompatible types. Found: 'int', required: 'short'
        //short s2 = 123456;
        short s3 = (72+100)/3;
        System.out.println("s3 " + s3);
        short s4 = 0b11;
        short s5 = 03456;
        short s6 = 0X1FF;
        // Incompatible types. Found: 'double', required: 'short'
        //short s7 = 8.9;

        int i1 = 8964;
        // Incompatible types. Found: 'double', required: 'int'
        //int i2 = 8.6;
        int i3 = (8*9)/5;
        System.out.println("i3 " + i3);
        int i4 = 0b11111111111;
        System.out.println("i4 " + i4);
        int i5 = 076543;
        int i6 = 0xFADfFF;

        long lng1 = 123333;
        // Incompatible types. Found: 'double', required: 'long'
        //long lng2 = 789.0;
        long lng3 = 98*789/8;//98998*7898;
        System.out.println("lng3 " + lng3);
        // Numeric overflow in expression. Numeric overflow in expression.
        // This might result in negative value, as expressions are evaluated to integer and then assigned to long
        long lng4 = 98988*78988/8;//98998*78989;
        System.out.println("lng4 " + lng4);
        // Works fine as say the expression values as long
        long lng5 = 98998L*78989L;//98998L*78989;//-- Works Fine without L for other//98998L*78989l;//-- works but small-(L) l looks like 1(one)
        System.out.println("lng5 "+lng5);
        long lng6 = 0b011111101111;
        // Integer number too large
        //long lng7 = 0b1010111111111111111111111111111111;
        // Adding L at end indicates long and works without errors, similarly for Octal and Hexa-Decimal
        long lng8 = 0b1010111111111111111111111111111111L;
        long lng9 = 06577535;//06577535L
        long lng10 = 0xFa865FFDL;//0xFa865FFDL
        // Integer number too large
        // Fix is add L to indicate long 0XFA865FFDEFL;
        //long lng11 = 0XFA865FFDEF;

        float f1 = 112;
        System.out.println("f1 " + f1);
        // Incompatible types. Found: 'double', required: 'float'
        //float f2 = 12.89;
        float f3 = 87*99/7;//87*99/9;
        // as the expressions are evaluating to integer, decimal values are not coming. Can be fixed by adding F or f beside any numeral or all
        System.out.println("f3 " + f3);
        float f4 = 87*99F/7;//87*99/7f;
        System.out.println("f4 " + f4);
        // Incompatible types. Found: 'double', required: 'float'
        //float f5 = 89.78*88.90/8.9;//89.78F*88.90F/8.9;//89.78*88.90F/8.9f;
        float f6 = 89.78F*88.90F/8.9f;
        System.out.println("f6 " +f6);
        float f7 = 0b1010111111;// Note cannot use F or f for float numbers, considered as numeral, giving compiler error
        // Integer number too large
        //float f8 = 0765762324665;
        float f9 = 0765762324665F;
        System.out.println("f9 " + f9);
        // Integer number too large
        //float f10 = 0XFFFFFFFDDDF;// Note cannot use F or f for float numbers, as it is part of hexa decimal syntax
        float f11 = 0xDeFF;
        System.out.println("f11 " + f11);

        double d1 = 567;
        System.out.println("d1 " + d1);
        double d2 = 67.980;
        // as the expressions are evaluating to integer, decimal values are not coming. Can be fixed by adding F or f beside any numeral or all
        double d3 = 87*99/7;//87*99/9;
        System.out.println("d3 " + d3);
        double d4 = 87.90*99/7;//87*99d/7;//87D*99/7
        System.out.println("d4 " + d4);
        double d5 = 0b101111011111111111111111111111;// Note cannot use D or d for double numbers, considered as numeral, giving compiler error
        System.out.println("d5 " + d5);
        // Integer number too large
        //double d6 = 056743743476;
        double d7 = 056743743476D;//056743743476d;
        System.out.println("d7 " + d7);
        // Integer number too large
        //double d8 = 0xFFFDEDDFED;// Note cannot use D or d for double numbers, as it is part of hexa decimal syntax
        double d8 = 0xFFFDEDD;
        System.out.println("d8 " + d8);
    }

}
