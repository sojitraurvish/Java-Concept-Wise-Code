/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.io.*;

public class Main6
{
    public static void main(String args[])throws IOException
    {
        int ch;
        FileReader fr=new FileReader("I:/java/24 file handeling in java/hello.txt");
        BufferedReader br=new BufferedReader(fr);
        String s1;
        while((s1=br.readLine())!=null)
        {
            System.out.println(s1);
        }
        
        br.close();
    }
}