package org.pjay.ocajp8;

public class App11 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        // Exception -- Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 8
        //sb.insert(8,"-");
        sb.insert(7,"-");
        System.out.println("sb >>> "+sb);
        sb.insert(0,"-");
        System.out.println("sb >>> "+sb);
        sb.insert(4,"-");
        System.out.println("sb >>> "+sb);

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y);

        String x1 = "Hello World";
        String y1 = " Hello World".trim();
        System.out.println(x1 == y1);
        System.out.println(x1.equals(y1));

        String s1 = "abc";
        String s2 = s1.toUpperCase();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}
