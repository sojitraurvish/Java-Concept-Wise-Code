/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;

class A
{
    int a;
    public A()
    {
        System.out.println("A");
    }
    public A(int a)
    {
        System.out.println("A int a");
    }
}

class B extends A
{
    int b;
    public B()
    {
        super(15);//it must be first line
        /*super(); it is not manditory to write. if we not write so compiler will write 
        but sum time's class A constracter has one or more argument so compailer will call only default constracter
        so we hava to call using one argument like ----->super(10);*/ 
        System.out.println("B");
    }
}

//if we not make ary constracter in any class so campiler will autometicli make default constracter in both the class and it is same for one class.

class Main
{
    public static void main(String args[])
    {
        B b=new B();
    }
}