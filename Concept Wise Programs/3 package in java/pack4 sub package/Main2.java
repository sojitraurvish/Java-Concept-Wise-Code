/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

package pkg1.pkg2;

import static java.lang.System.*;
//import java.util.*;
import pkg1.*;

public class Main2 extends Main//student
{
    private long enro;

    public void set()
    {
        super.set();
        out.println("enter enrollment no:");
        enro=Main.sc.nextLong();
    }

    public void get()
    {
        super.get();
        out.println("enrollment no:"+enro);
    }
}

