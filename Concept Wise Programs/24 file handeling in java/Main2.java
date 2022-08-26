/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

//data writing in file using fileoutput stream

/*FileOutputStream is meant for writing streams of raw bytes
  FileOutputStream is subcalass of OutputStream*/
import java.io.*;


class Main2
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream f=new FileOutputStream("I:/java/24 file handeling in java/hello.txt",true);
        String s="tata";
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            f.write(ch[i]);
        }
        f.close();
    }
}