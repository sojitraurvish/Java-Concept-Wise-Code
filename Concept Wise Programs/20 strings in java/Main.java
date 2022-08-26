/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class Main
{
    public static void main(String args[])
    {
        String str1="urvish sojitra";
        String str2="urvish sojitra";
        String str3="urvish "+"sojitra";//str 1,2,3 will refere only 1 object when value is same.

        String str4="urvish"+str1; // this is new object when value is not match

        String str5=new String("my name is urvish"); //but when you are making string with new oprater
                                                     // at that time it make new object


        String str6="computer";
        String str7="computer";
        String str8=new String("computer");

        System.out.println(s1==s2);//true chack the same object or not
        System.out.println(s1.equals(s2));//true chack the two string are same or not
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true 
    }
}