/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

package pkg1;

import static java.lang.System.*;
import java.util.*;

public class Main//person
{
    public static Scanner sc=new Scanner(System.in);
    private String name;
    private int age;

    public void set()
    {
        out.println("Enter name:");
        name=sc.nextLine();

        out.println("Enter age:");
        age=sc.nextInt();
    }

    public void get()
    {
        out.println("Name:"+name);
        out.println("age:"+age);
    }
}

