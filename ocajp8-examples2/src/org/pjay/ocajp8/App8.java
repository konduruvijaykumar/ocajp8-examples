package org.pjay.ocajp8;

public class App8 {

    public App8(){
        appVar = "App8";
    }

    String appVar;

    public static void main(String[] args) {

        // Logical &(AND), |(OR), ^(XOR)
        System.out.println("true & true >>> " + (true & true));
        System.out.println("true & false  >>> " + (true & false));
        System.out.println("false & true >>> " + (false & true));
        System.out.println("false & false >>> " + (false & false));

        System.out.println("true | true >>> " + (true | true));
        System.out.println("true | false  >>> " + (true | false));
        System.out.println("false | true >>> " + (false | true));
        System.out.println("false | false >>> " + (false | false));

        System.out.println("true ^ true >>> " + (true ^ true));
        System.out.println("true ^ false  >>> " + (true ^ false));
        System.out.println("false ^ true >>> " + (false ^ true));
        System.out.println("false ^ false >>> " + (false ^ false));

        // Short Circuit &&(AND), ||(OR)
        // Note: Difference from above is right side of expression might not be evaluated, if the result can be determined as true by left side of statement
        System.out.println("true && true >>> " + (true && true));
        System.out.println("true && false  >>> " + (true && false));
        System.out.println("false && true >>> " + (false && true));
        System.out.println("false && false >>> " + (false && false));

        System.out.println("true || true >>> " + (true || true));
        System.out.println("true || false  >>> " + (true || false));
        System.out.println("false || true >>> " + (false || true));
        System.out.println("false || false >>> " + (false || false));

        int y = 3;
        boolean x = true || y > 3;
        System.out.println("x " + x);

        App8 appObj1 = new App8();
        if(null != appObj1 && "App8".equals(appObj1.appVar)){
            System.out.println("We have got appVar as App8");
        }

        appObj1 = null;
        if(null != appObj1 && appObj1.appVar.equals("App8")){// if(null != appObj1 && "App8".equals(appObj1.appVar)){
            System.out.println("We have got appVar as App8");
        }else{
            System.out.println("Looks like appObj1 is null");
        }

        try {
            if(null != appObj1 & appObj1.appVar.equals("App8")){
                System.out.println("We have got appVar as App8");
            }
        }catch (NullPointerException npe){
            System.out.println(npe.toString());
        }

        int i = 6;
        boolean j = i>=6 || ++i<=7;
        System.out.println("i " + i);
        System.out.println("j " + j);

        if(null == appObj1 || 3 > 5){
            System.out.println("See this output, So right side is not evaluated");
        }

        if(null == appObj1 && 3 > 5){
            System.out.println("You might not see this");
        }else{
            System.out.println("You might see this");
        }

    }

}
