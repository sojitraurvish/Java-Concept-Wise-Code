/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

public class Box
{
    private int l,b,h;

    public Box()
    {
        l=10;
        b=8;
        h=4;
    }

    public Box(int L,int B,int H)
    {
        l=L;
        b=B;
        h=H;
    }

    public Box(Box b)
    {
        l=b.l;
        this.b=b.b;
        h=b.h;
    }

    public void display()
    {
        System.out.println("l:"+l);
        System.out.println("b:"+b);
        System.out.println("h:"+h);
        System.out.println("\n");
    }

    public static void main(String args[])
    {
        Box b1=new Box();
        b1.display();
        Box b2=new Box(20,15,5);
        b2.display();
        Box b3=new Box(b2);
        b3.display();
    }
}