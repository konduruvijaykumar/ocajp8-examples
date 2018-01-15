/**
 * 
 */
package org.pjay.ocajp8;


/**
 * @author Vijay
 * @source http://www.javatpoint.com/exception-handling-with-method-overriding
 *
 */
public class OverridenMethodExceptionRestrictionDemo extends OverridenMethodExceptionRestrictionSuper {

	// Compiler error when throws IOException is used. 
	// Exception IOException is not compatible with throws clause in OverridenMethodExceptionRestrictionSuper.method1()
	// Case superclass method does not declare an exception
	// Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception
	public void method1(){ //throws IOException{
		System.out.println("In subclass method1()");
	}

	// No compiler error
	// Case superclass method does not declare an exception, but subclass overridden method declares unchecked exception
	// Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.
	public void method2() throws ArrayIndexOutOfBoundsException{
		System.out.println("In subclass method2()");
	}

	// Compiler error when throws Exception is used.
	// Exception Exception is not compatible with throws clause in OverridenMethodExceptionRestrictionSuper.method3()
	// Case subclass overridden method declares parent exception
	// Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
	public void method3(){ //throws Exception{
		System.out.println("In subclass method3()");
	}
	
	// No Compiler error
	// Case subclass overridden method declares subclass exception
	// Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
	public void method4() throws ArrayIndexOutOfBoundsException {
		System.out.println("In subclass method4()");
	}

	// No Compiler error
	// Case subclass overridden method declares same exception
	// Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
	public void method5() throws ArrayIndexOutOfBoundsException{
		System.out.println("In subclass method5()");
	}

	// No Compiler error
	// Case subclass overridden method declares subclass exception
	// Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
	public void method6() throws ArithmeticException {
		System.out.println("In subclass method6()");
	}

	// No Compiler error
	// Case subclass overridden method declares no exception
	// Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
	public void method7() {
		System.out.println("In subclass method7()");
	}
	
	public static void main(String[] args) {
		OverridenMethodExceptionRestrictionDemo instance = new OverridenMethodExceptionRestrictionDemo();
		System.out.println("==================== Method calls ========================");
		instance.method1();
		instance.method2();
		instance.method3();
		instance.method4();
		instance.method5();
		instance.method6();
		instance.method7();
	}

}

class OverridenMethodExceptionRestrictionSuper {
	
	public void method1(){
		System.out.println("In super method1()");
	}
	
	public void method2(){
		System.out.println("In super method2()");
	}
	
	public void method3() throws ArithmeticException{
		System.out.println("In super method3()");
	}
	
	public void method4() throws IndexOutOfBoundsException{
		System.out.println("In super method4()");
	}
	
	public void method5() throws ArrayIndexOutOfBoundsException{
		System.out.println("In super method5()");
	}
	
	public void method6() throws Exception{
		System.out.println("In super method6()");
	}
	
	public void method7() throws Exception{
		System.out.println("In super method7()");
	}
}