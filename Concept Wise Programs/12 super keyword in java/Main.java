/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class A
{
    int z=10;
    public void f1()
    {
        System.out.println("z:"+z);
    }
}

class B extends A
{
    int z=101;
    public void f1()
    {
        super.f1();
        System.out.println("z:"+z);
        //this /*sub class type reference variable*/
        //super /*super class type reference variable*/ //both refurering current object it is like local variable

        //A super=new B(); how super can built
    }

    public void f2()
    {
        int z;
        z=2;
        this.z=3;
        super.z=4;

    }

}

class Main
{
    public static void main(String args[])
    {
        B b=new B();
        b.f1();
        b.f2();
        
    }
}

//A class reference variable can hold B class reference.
//but it can access only those members who are orignally of class A   