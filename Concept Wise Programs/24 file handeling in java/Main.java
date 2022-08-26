/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

import java.io.File;
import java.io.IOException;


class Main
{
    public static void main(String args[])throws IOException
    {
        File f=new File("I:/java/24 file handeling in java/hello.txt");
        f.createNewFile();
        System.out.println("is exists:"+f.exists());
        System.out.println("can file write:"+f.canWrite());
        System.out.println("file name:"+f.getName());
        System.out.println("length of file:"+f.length());        
        f.delete();   
        System.out.println("is exists:"+f.exists());
        System.out.println("can file write:"+f.canWrite());
        System.out.println("file name:"+f.getName());
        System.out.println("length of file:"+f.length());      
    }
}

/*there are two stream in java 
byte 
character -> this internally uses byte stream
*/