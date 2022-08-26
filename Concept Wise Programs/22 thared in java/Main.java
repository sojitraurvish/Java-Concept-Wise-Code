/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

//thared using runable interface through
//1 create thread
//2 attach code with thread
//3 run thread
import java.util.*;
import static java.lang.System.out;


class A implements Runnable
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int i;
        for(i=0;i<=100*100;i++)
        {
            out.println("Thread A"+i);
        }

    }
}

class B implements Runnable
{
    public void run()
    {
        int i;
        for(i=0;i<=100*100;i++)
        {
            System.out.println("Thread B "+i);
        }

    }
}

class C implements Runnable
{
    public void run()
    {
        int i;
        for(i=0;i<=100*100;i++)
        {
            System.out.println("Thread C "+i);
        }

    }
}
public class Main
{
    public static void main(String args[])
    {
        Thread t1=new Thread(new A());
        Thread t2=new Thread(new B());
        Thread t3=new Thread(new C());
        t1.start();
        t2.start();
        t3.start();

    }
}   