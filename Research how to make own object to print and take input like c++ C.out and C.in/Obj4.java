/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;

class Cout<C,S,B,Sh,I,L,F,D>
{
    //output methods
    public Cout <C,S,B,Sh,I,L,F,D> c(C v)//to print only (char) in small latter
    {
        System.out.printf("%c",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> cc(C v)//to print only (char) in Capital latter
    {
        System.out.printf("%C",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> s(S v)//to print only small leater (string) value
    {
        System.out.printf("%s",v);
        return this;
    }

     public Cout <C,S,B,Sh,I,L,F,D> cs(S v)//to print only capitel leater (string) value
    {
        System.out.printf("%S",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> b(B v)//to print only (byte) value 
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> sh(Sh v)//to print only (short) value
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> i(I v)//to print only (int) value
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> l(L v)//to print only (long) value
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> f(F v)//to print only (float) value
    {
        System.out.printf("%f",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> d(D v)//to print only (double) value
    {
        System.out.printf("%f",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> n()//to taking (new line)
    {
        System.out.println();
        return this;
    }
    
    //(user input) methods
    public char C()//to input (char) value
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        return c;
    }

    public String S()//to input one word (string) value
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        return s;
    }

    public String SW()//to input multiple word (string) value
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        return s;
    }
    
    public byte B()//to input (byte) value
    {
        Scanner sc=new Scanner(System.in);
        byte b=sc.nextByte();
        return b;
    }

    public short SH()//to input (short) value
    {
        Scanner sc=new Scanner(System.in);
        short s=sc.nextShort();
        return s;
    }

    public int I()//to input (int) value
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        return i;
    }

    public long L()//to input (long) value
    {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        return l;
    }

    public float F()//to input (float) value
    {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        return f;
    }

    public double D()//to input (double) value
    {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        return d;
    }
}

class S
{
    static Cout <Character,String,Byte,Short,Integer,Long,Float,Double> o=new Cout<Character,String,Byte,Short,Integer,Long,Float,Double>();
    static Scanner sc=new Scanner(System.in);
}

class Obj4
{
    public static void main(String args[])
    {
        char c='a';
        String s="hello";
        byte b=100;
        short sh=7000;
        int i=5000000;
        long l=100000000000l;
        float f=10.20f;
        double d=10.20000;
        

        S.o.i(i);/*1]. Here we have 'S' class 'o' is [static (member) of 'S' class] And [(object) of 'Cout' class]
                        And 'i();' is a member function of 'Cout' class */

                /*2].  To (print value) of variable use small latter function like -> for int use i(<'int' variable name> Or <'int' direct value>); function*/ 

                /*3].  To (take input from user) in variable use Capital latter function like -> for int use I(<here no any argument>); function*/

                /*4]. we can pass only one value in one in any function at a time.*/
                /*5]. If we want to (pass or print) more than one value of variable so we will hava to write*/

                //->Syntex S.o.i(<'int' variable name> Or <'int' direct value>).c(<'char' variable name> Or <'char' direct value>);  
                //int in;
                //char ch;
                //->S.o.i(in).c(ch);

        //type of input function.
        
        /*NOTE :- To (take input from user) in variable use Capital latter function like -> for int use I(<here no any argument>); function*/

        S.o.n(); //to take new line n();
        S.o.s(" "); //it is to print string but it is also used to print space,[''],or other thing but cann't print [""].
        S.o.c(c).n();//to take print small char c();
        S.o.cc(c).n();//to take print capital char cc();
        S.o.s(s).n();//to take print small string s();
        S.o.cs(s).n();//to take print capital string cs();
        S.o.b(b).n();//to take print byte b();
        S.o.sh(sh).n();//to take print short sh();
        S.o.i(i);//to take print int i();
        S.o.l(l).n();//to take print long l();
        S.o.f(f).n();//to take print float f();
        S.o.d(d).n();//to take print double d();
        
        //type of (user input) function.

        //to input value from user we have two ways
        //1] s=S.o.S();
        //2]. to input value from user
        s=S.o.s("Enter one String:").S();//to input (String) of only one word
        S.o.s(s).n();

        s=S.o.s("Enter one String word:").SW();//to input (String) of multiple word
        S.o.s(s).n();

        c=S.o.s("Enter one char:").C();//to input (char) value
        S.o.c(c).n();

        b=S.o.s("Enter one byte:").B();//to input (byte) value
        S.o.b(b).n();

        sh=S.o.s("Enter one short:").SH();//to input (short) value
        S.o.sh(sh).n();

        i=S.o.s("Enter one int:").I();//to input (int) value
        S.o.i(i).n();

        l=S.o.s("Enter one long:").L();//to input (long) value
        S.o.l(l).n();

        f=S.o.s("Enter one float:").F();//to input (float) value 
        S.o.f(f).n();
        
        d=S.o.s("Enter one double:").D();//to input (double) value
        S.o.d(d).n();
    }
}