/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

abstract class A //abstract class conststs constracter
{
    abstract void show();
    void fun()
    {
        System.out.println("C show:");
    }
    
}//we cann't make object of abstract class but we can make reference variable of it and extends it
//if there is at list one method in class so it is mandetory to make abstract class
//but it is not compalsory to make abstract method in abstract class.

abstract class B extends A
{
    // if we don'nt want to provide defination of show function so we have to make class b as a abstract
}

class C extends B
{
    void show()
    {
        System.out.println("C show:");
    }
}

class Main
{
    public static void main(String args[])
    {
        C c=new C();
        c.show();
    }
}