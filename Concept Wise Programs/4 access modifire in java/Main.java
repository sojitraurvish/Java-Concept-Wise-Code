/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */


public class Main //outer class it can be public or (default) -> don't need to write default
{   //outer class can only be public once in one (*.java) file but it(outer public class) can be more than one in same package

    //member variable and function
        //private:- private member cann't be accessable out side of class.

        //protected:- it can be accessable to any class of same package or chaild class of another package 

        //public:- it can be accessable from any package

        //default:- don't need to write default. it can be accessable from same package not from other package


        /*              default   private   protected   public
          Same class--     Y         Y          Y         Y
        -------------------------------------------------------     
          Same package     Y         N          Y         Y
          child class
        -------------------------------------------------------
          same package     Y         N          Y         Y
         non-child clsss
        -------------------------------------------------------
        Different package  N         N          Y         Y
            child clss
        -------------------------------------------------------
        Different package  N         N          N         Y
         non-child clsss                                       */


    class Main2 // inner class it can be private,public,protected,(default) -> don't need to write default
    {

    }
}