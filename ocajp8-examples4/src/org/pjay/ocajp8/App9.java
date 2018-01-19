package org.pjay.ocajp8;

public class App9 {

    public static void main(String[] args) {

        Super aSuper = new SubClass();
        // Compiler Error -- 'print()' has private access in 'org.pjay.ocajp8.Super'
        // Observer properly private method hence not visible outside class
        //aSuper.print();

    }

}

class Super{
    private final void print(){
        System.out.println("Class Super");
    }
}

class SubClass extends Super{
    // Method hiding and not overriding, as the method in super is private
    private void print(){
        System.out.println("Class SubClass");
    }
}