/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class Main3
{
    public static void main(String args[])
    {
        int balance=5000;
        int withdrowlAmmount=6000;

        try
        {
            if(balance < withdrowlAmmount)
            {
                throw new ArithmeticException("insufficient balance");
            }
            else
            {
                balance=balance-withdrowlAmmount;
                System.out.println("transection successfully completed");
            }
        }
        catch(ArithmeticException e)
        {
           System.out.println("ArithmeticException:"+e.getMessage());
        }
        System.out.println("program continue..");
        
    }
}