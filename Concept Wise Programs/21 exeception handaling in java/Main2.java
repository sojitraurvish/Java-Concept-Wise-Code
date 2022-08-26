/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class Main2
{
    public static void main(String args[])
    {
        try
        {
            System.out.println(3/0);
            System.out.println("in print");
            //here write that code where exception may accure
        }//after try block we have to write either catch or finally 
        catch(ArithmeticException e)
        {
            System.out.println("catch:"+e.getMessage());
            //when exeception will accure at that time catch block will call 
        }
        catch(Exception e)
        {
            System.out.println("catch:"+e.getMessage());
            //when exeception will accure at that time catch block will call 
        }
         System.out.println("fsdfs");
        /*finally optional
        {

        }*/
    }
}