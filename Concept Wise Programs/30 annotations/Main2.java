/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

//anonimus class and lemda expration

class Urvish{
    public void anonimsClassMethod()
        {
            System.out.println("method of Urvish class");
        }

        public void toy()//compile time bainding
        {
            System.out.println("toy method of Urvish class");
        }

        public void loy()//run time bainding
        {
            System.out.println("loy method of Urvish class");
        }
}

class Jay extends Urvish{
    public void loy()//run time baindingn becouse we have override it
        {
            System.out.println("loy method of jay class");
        }
}

class Java{
    Urvish referenceVarOfParentClass=new Urvish(){//inner class and Anonims child class of Urvish
        public void anonimsClassMethod()
        {
            System.out.println("method of Anonims Child Inner Class");
        }
    };

}

class Main2{
    public static void main(String[] args)
    {
        Java j=new Java();
        j.referenceVarOfParentClass.anonimsClassMethod();

        Urvish u=new Urvish();
        u.anonimsClassMethod();

        Urvish uj=new Jay();
        uj.loy();//lat bainding

    }
}