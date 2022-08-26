/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

//data reading through file

import java.io.*;

class Main3
{
    public static void main(String args[])throws IOException
    {
        FileInputStream f=new FileInputStream("I:/java/24 file handeling in java/hello.txt");

        int i;
        do
        {
            i=f.read();//it will return -1 at last
            if(i!=-1)
            {
                System.out.println((char)i);
            }
        }while(i!=-1);
        f.close();
    }
}