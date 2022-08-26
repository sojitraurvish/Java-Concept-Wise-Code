/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.*;

class Hello
{
    int x=20;//globle instance member //it contain by default 0
    static int y=30;//static member variable or class variable -> it create only once //it contain by default 0

    public void fun1()//instance member function
    {
        //it here we create viable so, it will be blank variable
        x=10;
        y=20;//it can access both the variables
    }

    public static void fun2()//static member variable
    {
        //x=30; error
        y=10;//it can only access static member variable
    }

    static class Test
    {
        //static inner class
        public static String contry="India";
    }
}

class Main
{
    public static void main(String args[])
    {
        Hello m=new Hello();

        System.out.println("intance variable:"+m.x);
        System.out.println("static variables:"+Hello.y);
        m.fun1();
        System.out.println("intance variable:"+m.x);
        System.out.println("static variables:"+Hello.y);
        Hello.fun2();
        System.out.println("intance variable:"+m.x);
        System.out.println("static variables:"+Hello.y);
        System.out.println(Hello.Test.contry);

    }
}