/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class A
{
    public A()
    {
        System.out.println("A 1");
    }
}

class B extends A
{
    /*constracter call his class other constracter is call constracter chaining*/
    public B() 
    {
        this(); // or super(); if we not write this so compiler will write super by default.
        System.out.println("B 1");
    }

    public B(int k)
    {
        //super(); by default compiler will write this line if we write this() above statement
        System.out.println("B 2");
    }
}

class Main
{
    public static void main(String args[])
    {
        B b=new B();
    }
}