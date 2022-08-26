/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;
import static java.lang.System.out;
import static java.lang.System.*;
//import static example.tools.ShowMe.*;

/*class Cout<C,S,B,Sh,I,L,F,D,V>
{
    //output methods            <T> ->   c(T v) pan chale 
    public <T> Cout <C,S,B,Sh,I,L,F,D,V> c(C v)//to print only char in small latter
    {
        System.out.printf("%c",v);
        return this;
    }
}
class S
{
    static Cout <Character,String,Byte,Short,Integer,Long,Float,Double,Void> o=new Cout<Character,String,Byte,Short,Integer,Long,Float,Double,Void>();
    static Scanner sc=new Scanner(System.in);
}*/

class Cout
{
	
	//public static PrintWriter o;
	public <T> Cout p(T arg) 
	{
	        out.println(arg);
			return this;
	}

	/*public Cout <C,S,B,Sh,I,L,F,D,V> c(C v)//to print only char in small latter
    {
        System.out.printf("%c",v);
        return this;
    }*/
	
	/*public static<T> i(T arg) 
	{
	        return args
	}*/
}

class S
{
	static Scanner sc=new Scanner(System.in);
	static Cout o=new Cout();
}

class Obj6
{
	public static void main(String args[])
	{
	
		String st1="hello";
		out.print(st1);
		S.o.p(st1).p(st1);
	}
	
}


























