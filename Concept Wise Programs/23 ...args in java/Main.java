/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import static java.lang.System.out;

class Main
{
    static void sum(String ...arr/*,String ...arr2*/)
    {
        //int result=0;
        /*for(int a:arr)
        {
            out.println(a);  
        }*/
        for(int i=0;i<arr.length;i++)
        {
            out.println(arr[i]);
        }
        //return result;
    } 

    /*static int sum(int a,int b)
    {
        return a+b;
    } */
    public static void main(String args[])
    {
        sum("hkee");
        sum("sfsdf","sfsfsffsf");
    }
}