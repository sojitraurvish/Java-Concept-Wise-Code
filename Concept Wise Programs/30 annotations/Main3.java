/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

    interface Demo{
        void meth1();
        void meth2();
    }

    // class ADemo implements Demo
    // {
    //     public void dispaly()
    //     {
    //         System.out.println("display");
    //     }

    //     @Override
    //     public void meth1()
    //     {
    //         System.out.println("I am in Meth1");
    //     }

    //     @Override
    //     public void meth2()
    //     {
    //         System.out.println("i am in meth2");
    //     } 
    // } 

public class Main3{
    
    public static void main(String[] args)
    {
        // ADemo ad=new ADemo();
        // ad.meth1();

        Demo obj=new Demo(){
            @Override
            public void meth1()
            {
                System.out.println("I am in Meth1");
            }

            @Override
            public void meth2()
            {
                System.out.println("i am in meth2");
            } 
        };
        obj.meth1();
    }
}