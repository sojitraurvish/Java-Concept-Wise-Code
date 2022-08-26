/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class A
{
    static int y=4;//1 static member variable do not inherit
    
}

class B extends A
{
    //3 static int y=4; (if i not maintion here this*) otherwise this variable contain 10 and it called variable hideing
    static
    {
        y=10;
    }
}

class Main
{
    public static void main(String args[])
    {
        System.out.println(B.y);//2 but compailer will make it =======> System.out.println(A.y); (if i not maintion here this*)
    }
}

