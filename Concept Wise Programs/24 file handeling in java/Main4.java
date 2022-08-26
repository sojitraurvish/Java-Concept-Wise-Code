/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.io.*;

public class Main4
{
    public static void main(String args[])throws IOException
    {
        FileWriter fw=new FileWriter("I:/java/24 file handeling in java/hello.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("compueter");
        bw.close();
    }
}