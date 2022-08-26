/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class A
{
    static int y=4;//static member variable do not inherit
    public static void f1()
    {
        System.out.println("A");
    }
}

class B
{
    public static void f1() //function hideing 
    {  
        System.out.println("B");
    }
}

class Main
{
    public static void main(String args[])
    {
        B b=new B();
        b.f1();
    }
}

//it is a compile-time error if a static methed hides an instance method.
//it is also compile-time error if an intance method overrides a static method.