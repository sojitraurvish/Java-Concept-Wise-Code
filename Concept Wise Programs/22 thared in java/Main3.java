/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

//multithreading 

import java.util.Scanner;

class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal=bal;
    }

    public boolean isSufficientBalance(int w)
    {
        if(bal>w)
        {
            return (true);
        }
        else
        {
            return (false);
        }
    }

    public void withdrow(int amt)
    {
        bal=bal-amt;
        System.out.println("withdrowl money is :"+amt);
        System.out.println("your current balance is :"+bal);
    }
}

class Customer implements Runnable
{
    private Account account;
    private String name;
    public Customer(Account account,String name)
    {
        this.account=account;
        this.name=name;
    }

    public void run()
    {
        Scanner sc=new Scanner(System.in);
        

        synchronized(account)
        {
            System.out.println(name+" Enter ammount to withdrow:");
            int amt=sc.nextInt();
            if(account.isSufficientBalance(amt))
            {
                System.out.println(name);
                account.withdrow(amt);
            }
            else
            {
                System.out.println("Insufficiant balance");
            }
        }
    }
}
class Main3
{
    public static void main(String args[])
    {
        Account a1=new Account(1000);
        Customer c1=new Customer(a1,"urvish"),c2=new Customer(a1,"jigna");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}