/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;

class C
{
	static Scanner sc=new Scanner(System.in);
	static C t=new C();
	public static <T> C out(T var) 
	{
	        System.out.print(var);
			return t;
	}
}

class Obj9
{
	public static void main(String args[])
	{
	
		String st1="hello";
		int i=10;

		C.out("value \n"+st1+i+"hello hi");
		C.out(1).out("\n");
		C.out("value \n"+st1+i+"hello hi");
		C.out(1).out("\n");
	
	}
	
}



























