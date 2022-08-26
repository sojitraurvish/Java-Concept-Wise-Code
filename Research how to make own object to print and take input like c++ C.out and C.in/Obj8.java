/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;

class S
{
	static Scanner sc=new Scanner(System.in);
	static S t=new S();
	public static <T> S o(T var) 
	{
	        System.out.print(var);
			return t;
	}
}

class Obj8
{
	public static void main(String args[])
	{
	
		String st1="hello";
		S.o(st1);
		
		/*S.o(<var1>,<var2>); this give error we cann't 
								pass more then one argument
								And if we want that so we have
								to use like this way*/

	int i=20;
		S.o(1).o("The message is "+i);
	}
	
}



























