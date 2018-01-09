/**
 * 
 */
package org.pjay.ocajp8;

/**
 * @author vijayk
 *
 */
public class LocalVariables {
	
	public static void main(String[] args) {
		int i, j = 10;
		int sum;
		AnotherClass anotherClass;
		String s1 = "ABC", s2;
		// error: variable anotherClass might not have been initialized
		//System.out.println("anotherClass value is " + anotherClass);
		System.out.println("s1 is :: " + s1);
		// error: variable s2 might not have been initialized
		//System.out.println("s2 is :: " + s2);
		// error: variable i might not have been initialized
		//sum = i+j;
		//System.out.println("sum is :: " + sum);
		LocalVariables localVariables = new LocalVariables();
		localVariables.findAnswer(false);
		localVariables.findAnswer(true);
	}
	
	private void findAnswer(boolean check){
		int oneVal;
		int secondVal;
		if(check){
			oneVal = 1;
			secondVal = 1;
		}else{
			oneVal = 0;
		}
		System.out.println("oneVal :: " + oneVal);
		// error: variable secondVal may not have been initialized
		//System.out.println("secondVal :: " + secondVal);
	}

}

class AnotherClass{
	int k = 30;
}
