/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.util.Date;
class Main2{
    public static void main(String ...args)
    {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());


        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());// from year 1901
    }
}