/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;

class Cout<U,T>
{
    public void o1s(U s)//for print only string
    {
        System.out.println(s);
    }

    public void o1v(T s)//for print any value
    {
        System.out.println(s);
    }
    
    public void o2(U s,T d)//for print string with one any other value
    {
        System.out.println(""+s+":"+d);
    }

    /*public int in(int p)
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println(s);
        //System.out.printf("%s %d",s,d);
        p=sc.nextInt();
        return p;
    }*/ 
}

class S
{
    //static Cout <String,Boolean> B=new Cout<String,boolean>();
    static Cout <String,Character> c=new Cout<String,Character>();
    static Cout <String,Byte> b=new Cout<String,Byte>();
    static Cout <String,Short> s=new Cout<String,Short>();
    static Cout <String,Integer> i=new Cout<String,Integer>();
    static Cout <String,Long> l=new Cout<String,Long>();
    static Cout <String,Float> f=new Cout<String,Float>();
    static Cout <String,Double> d=new Cout<String,Double>();
}

class Obj
{
    public static void main(String args[])
    {
        float f=15.10f,f2=15.50f;
        S.f.o1s("fghkghf");
        S.f.o1v(f);
        S.f.o2("fghkghf",f);
    }
}