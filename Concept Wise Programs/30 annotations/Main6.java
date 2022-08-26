/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class View
{
    void onClick()
    {

    }

    public void setOnClickListener(View obj) {
        obj.onClick();
        // throw new RuntimeException("Stub!");
    }
}

class Btn extends View
{

}

public class Main6{
    
    public static void main(String[] args)
    {
        Btn btn=new Btn();

        btn.setOnClickListener(new View(){
            public void onClick() {
                System.out.println("hello");
            }
        });
        // //2ed way
        // Demo obj=new Demo(){
        //     @Override
        //     public void meth1()
        //     {
        //         System.out.println("I am in Meth1");
        //     }
        // };
        // obj.meth1();
        
        //3ed way laemda expration
        // Demo obj2=(a)->{
        //     System.out.println("I am in meth1: "+a);
        // };
        // obj2.meth1(2);

    }
}