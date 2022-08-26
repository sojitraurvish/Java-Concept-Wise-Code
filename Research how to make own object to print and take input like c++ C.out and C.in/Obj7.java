/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;
import static java.lang.System.out;

class Cout
{
	public <T> Cout p(T arg) 
	{
	        out.print(arg);
			return this;
	}
}
class S
{
	static Scanner sc=new Scanner(System.in);
	static Cout o=new Cout();
}

class Obj7
{
	public static void main(String args[])
	{
	
		String st1="hello";
		out.print(st1);
		S.o.p(st1).p("\n");
		S.o.p(st1);
		
	}
	
}



























