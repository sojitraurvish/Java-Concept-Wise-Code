/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

   @FunctionalInterface
    interface Demo{
        void meth1(int a);
    }

public class Main4{
    
    public static void main(String[] args)
    {
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
        Demo obj2=(a)->{
            System.out.println("I am in meth1: "+a);
        };
        obj2.meth1(2);

    }
}