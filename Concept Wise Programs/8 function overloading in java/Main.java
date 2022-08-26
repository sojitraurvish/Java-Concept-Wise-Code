/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class A
{
    public void f1()
    {
        System.out.println("class:A->f1()");
    }
    public void f1(int a)
    {
        System.out.println("class:A->f1(int a)");
    }
}

class B extends A
{
    public void f1(float a)
    {
        System.out.println("class:A->f1(float a)");
    }

    public int f1(int a,float b)
    {
        System.out.println("class:A->f1(int a,float b)");
        return (0);
    }
}

class Main
{
    public static void main(String args[])
    {
        B b=new B();
        b.f1();
        b.f1(15);
        b.f1(15.25f);
        b.f1(60,25.5f);
    }
}