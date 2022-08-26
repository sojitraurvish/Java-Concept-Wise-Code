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
    public Cout <C,S,B,Sh,I,L,F,D> c(C v)//to print only char in small latter
    {
        System.out.printf("%c",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> cc(C v)//to print only char in Capital latter
    {
        System.out.printf("%C",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> s(S v)//to print only small leater string
    {
        System.out.printf("%s",v);
        return this;
    }

     public Cout <C,S,B,Sh,I,L,F,D> cs(S v)//to print only capitel leater string
    {
        System.out.printf("%S",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> b(B v)//to print only byte 
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> sh(Sh v)//to print only short
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> i(I v)//to print only int
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> l(L v)//to print only long
    {
        System.out.printf("%d",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> f(F v)//to print only float
    {
        System.out.printf("%f",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> d(D v)//to print only double
    {
        System.out.printf("%f",v);
        return this;
    }

    public Cout <C,S,B,Sh,I,L,F,D> n()//to taking new line
    {
        System.out.println();
        return this;
    }
    
    //input methods

    public String S()//input one word string
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        return s;
    }

    public String SW()//input multiple word string
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        return s;
    }
    
    public byte B()//input byte
    {
        Scanner sc=new Scanner(System.in);
        byte b=sc.nextByte();
        return b;
    }

    public short SH()//input short 
    {
        Scanner sc=new Scanner(System.in);
        short s=sc.nextShort();
        return s;
    }

    public int I()//input int
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        return i;
    }

    public long L()//input long
    {
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        return l;
    }

    public float F()//input float
    {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        return f;
    }

    public double D()//input double
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

class Obj3
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
        

        S.o.c(c).s(" ").n();
        S.o.cc(c).n();
        S.o.s(s).n();
        S.o.cs(s).n();
        S.o.b(b).n();
        S.o.sh(sh).n();
        S.o.i(i).n();
        S.o.l(l).n();
        S.o.f(f).n();
        S.o.d(d).n();

        
        s=S.o.s("Enter one String:").S();
        S.o.s(s).n();

        s=S.o.s("Enter one String word:").SW();
        S.o.s(s).n();

        b=S.o.s("Enter one byte:").B();
        S.o.b(b).n();

        sh=S.o.s("Enter one short:").SH();
        S.o.sh(sh).n();

        i=S.o.s("Enter one int:").I();
        S.o.i(i).n();

        l=S.o.s("Enter one long:").L();
        S.o.l(l).n();

        f=S.o.s("Enter one float:").F();
        S.o.f(f).n();
        
        d=S.o.s("Enter one double:").D();
        S.o.d(d).n();
    }
}