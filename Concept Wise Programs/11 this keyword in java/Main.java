/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class Box
{
    private int l,b,h;

    Box()
    {
        //Rule: Call to this() must be the first statement in constructor.
        //this reference vatiable is also used in constracter.
        //this(5);
        System.out.println("hello a");
    }  
    Box(int x)
    {  
        this();  
        System.out.println(x);  
    }  

    public void setDimention(int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
        //this is function variable and when object is begin at that time it will be and it will distory with the object end.
    } 

    public int sendBox()
    {
        GiftTaker gf=new GiftTaker();
        gf.acceptGift(this);
        //this can represt caller object

        return this;
    }

    
}
class Main
{
    public static void main(String args)
    {
        Box b1=new Box();
        b1.setDimention(12,15,19);
        b1.sendBox()
    }
}