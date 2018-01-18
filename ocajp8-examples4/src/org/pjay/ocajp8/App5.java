package org.pjay.ocajp8;

import org.pjay.ocajp8.diffpackage.App52;

public class App5 extends App52{//extends App51

    public static void main(String[] args) {
        // Compiler error: 'value' is not public in 'org.pjay.ocajp8.App51'. Cannot be accessed from outside package
        // Which should have worked, but b'coz of inheritance due to App52. This does not work
        // value will not get inherited, as tis class is second level in hierarchy
        //System.out.println("value in app5 " + value);
        new App5().print();
    }

    private void print(){
        // Only available if extends App51
/*        System.out.println("value in app5 " + new App5().value);
        System.out.println("value in app5 " + this.value);
        System.out.println("value in app5 " + value);
        System.out.println("value in app5 " + super.value);*/

        // No inheritance required here, as object is created and used
        System.out.println("value in app5 " + new App51().value);
    }

}
