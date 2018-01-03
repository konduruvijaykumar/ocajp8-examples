package org.pjay.ocajp8;

import java.util.function.Predicate;

public class App3 {

    public static void main(String[] args) {
        //App3.test(integer -> integer > 5);
        System.out.println(App3.test(i->i==5));
        System.out.println(App3.test((i)->i==5));
        System.out.println(App3.test((i)->(i==5)));
        // Compiler error::
        //System.out.println(App3.test((i)->{i==5;}));
        System.out.println(App3.test((i)->{return i==5;}));
        // Compiler Error:: Incompatible parameter types in lambda expression: expected Integer but found int
        //System.out.println(App3.test((int i)->{return i==5;}));
        //System.out.println(App3.test((int i)->i==5));
    }

    private static boolean test(Predicate<Integer> predicate){
        return predicate.test(5);
    }

}
