/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

interface A
{
    int x=10;
    public void fun(); // interface method
}

interface B 
{
    public void fun1(); // interface method
  default public void fun()//this is allowed and you can 
  {
    System.out.println("fun");
  }
}

class C implements A, B {
  public void fun() 
  {
    System.out.println("fun");
  }
  public void fun1() 
  {
    System.out.println("fun1");
  }
}

class Main {
  public static void main(String[] args) 
  {
    C c = new C();
    c.fun();
    c.fun1();
  }
}


/*Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).*/