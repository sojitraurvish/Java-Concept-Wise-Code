/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;
import static java.lang.System.*;
class C
{
	static Scanner sc=new Scanner(System.in);
	static C t=new C();
	public static <T> C out(T var) 
	{
	        System.out.print(var);
	        //out.print(var.getClass().getSimpleName()+"\n");//to get class name of datatype
			return t;
	}
    
    @SuppressWarnings("unchecked")
    public static <T> T in(T var)
    {
        if(var.getClass().getSimpleName().equals("Byte"))//1 byte
        {
            Byte b=sc.nextByte();
            // var=(T)b;
            return (T)b;
        }
        else if(var.getClass().getSimpleName().equals("Short"))//2 bytes
        {
            Short s=sc.nextShort();
            // var=(T)s;
            return (T)s;
        }
        else if(var.getClass().getSimpleName().equals("Integer"))//4 bytes
        {
            Integer i=sc.nextInt();
            // var=(T)i;
            return (T)i;
        }
        else if(var.getClass().getSimpleName().equals("Long"))//8 bytes
        {
            Long l=sc.nextLong();
            // var=(T)l;
            return (T)l;
        }
        else if(var.getClass().getSimpleName().equals("Float"))//4 bytes
        {
            Float f=sc.nextFloat();
            // var=(T)f;
            return (T)f;
        }
        else if(var.getClass().getSimpleName().equals("Double"))//8 bytes
        {
            Double d=sc.nextDouble();
            // var=(T)d;
            return (T)d;
        }
        else if(var.getClass().getSimpleName().equals("Character"))//1 bit
        {
            Character c=sc.next().charAt(0);
            // var=(T)c;
            return (T)c;
        }
        else if(var.getClass().getSimpleName().equals("Boolean"))//1 bit
        {
            Boolean b=sc.nextBoolean();
            // var=(T)b;
            return (T)b;
        }
        else if(var.getClass().getSimpleName().equals("String"))
        {
            String str=sc.nextLine();
            str=sc.nextLine();
            return (T)str;
        }
            out.print("*Error");
            String str=sc.nextLine();
            str=sc.nextLine();
            return (T)str;
    }
}

class OFinal
{
	public static void main(String args[])
	{
	
		String st1="hello";
		int i=10;
        Integer I=20;
        int a[]=new int[5];//declaration and instantiation  
        a[0]=1000;
        Integer[] b = new Integer[4];
        b[0]=500;
        // b[0]=C.sc.nextInt();
        char c=0;


		// C.out("value");
        // C.out("\n");
        // C.out(st1);
        // C.out(I);
        // C.out(a[0]);
        // C.out(b[0]);
		// C.out(1).out(i);
        st1=C.out("Enter Str:").in(st1);
        C.out(st1+"\n");

        i=C.out("Enter int:").in(i);
        C.out(i+"\n");

        I=C.out("Enter int obj:").in(I);
        C.out(I+"\n");

        a[0]=C.out("Enter int arr:").in(a[0]);
        C.out(a[0]+"\n");

        b[0]=C.out("Enter int obj arr:").in(b[0]);
        C.out(b[0]+"\n");

        c=in(c);
        C.out(c+"\n");
	
	}
	
}