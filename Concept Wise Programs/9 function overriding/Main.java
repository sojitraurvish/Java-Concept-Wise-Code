/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class A
{
    public void f1(int a)
    {
        System.out.println("class:A->f1(int a):"+a);
    }
}

class B extends A
{
    public void f1(int a)
    {
        System.out.println("class:B->f1(int a):"+a);
    }
}

class Main
{
    public static void main(String args[])
    {
        B b=new B();
        b.f1(10);
    }
}