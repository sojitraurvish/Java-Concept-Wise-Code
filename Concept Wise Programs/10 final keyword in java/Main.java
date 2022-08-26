/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class Main
{
    private final int x=10;// if it is intance variable so it will contain 0 .and if it is final instance without intialize so it will blank variable.

    private final static int y;//it is also blank variable when you write final key word

    public void fun()
    {
        int x;// local variable it it also blank without intiallize.
        final int x//final local vatiable it it also blank without intiallize.

        //diffarence between both 
            //finle variable intialize once only
            //local multiple time  


        //static local variable not exits in java
    }



    public static void main(String args[])
    {

    }
}

//how we can intialize final intance variable

/* 1. intialize with declaretion x=10;
   2. through intialization block.
   3. through constracter.
*/

//how we can intialize static final variable 

/* 1. intialize with decleration x=10;
   2. through static intialization block.
*/       


class Dummy
{
    public final void someFunction() //we can not override this function
    {
        
    }
}

final class MoreDummy extends Dummy
{
    /*public final void someFunction()
    {
        //error
    }*/

    //we can not extands or inherit other class from this class
}
