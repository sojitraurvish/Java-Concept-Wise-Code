/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

//thred class 
import java.util.*;
import static java.lang.System.out;

class A extends Thread
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int i;
        for(i=0;i<=100;i++)
        {
            out.println("Thread A"+i);
        }

    }
}


class B extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<=100;i++)
        {
            out.println("Thread B"+i);
        }

    }
}

class C extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<=100;i++)
        {
            out.println("Thread C"+i);
        }

    }
}

class Main2
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        C c=new C();
        //a.start();
        //b.setPriority(1);//to set priority
        System.out.println(b.getPriority());//to get prority and default prority 5 of any thared
        //b.start();
        //c.start();


    }
}


//thread states in java
//1 New thared -> when thread is created
//2 Runable  -> when processer is assign
//3 Not Runable -> when it is out in queue for input
//4 Desd -> when it is completed