package org.pjay.ocajp8;

public class App10 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        int capacity = sb.capacity();
        char ch = sb.charAt(6);
        System.out.println(sub+" "+len+" "+ch);
        System.out.println("capacity " + capacity);

        StringBuilder sb1 = new StringBuilder().append(1).append('c').append(5.65F);
        sb1.append("-").append("vj").append(6.88).append(true);
        System.out.println(sb1);
    }

}
