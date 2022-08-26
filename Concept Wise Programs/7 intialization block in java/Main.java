/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class Main
{
    private int x;
    static private int y;

    {
        System.out.println("intializer block:x->"+x);
        x=5;
    }

    public Main()
    {
        System.out.println("Constracter:x->"+x);
         System.out.println("Constracter:y->"+y);
    }

    static
    {
        System.out.println("static intializer block:y->"+y);
        y=5;
    }

    public static void main(String args[])
    {
        Main m1=new Main();
    }
}

/* there are two type of intialize block in java 
    1. intance intialize block
    2. static intial block 
*/

/* 1 intance intialize block:-
    1. once object is created at that time instance intializer block will run
    2. we can make more then 1 intialize block . and compile will arrange all the blocks in to single block.
    3. but intializer block will execute first then constracter will execute.
    4. we can use this,super keyword in static intializer block but cann't use return keyword. 
*/

/* 2 static intializer block
    1. before object is created static instance intializer block will run and it will run befor main function and run only once if you made multiple object. 
    2. we can make more then 1 static intialize block . and compile will arrange all the blocks in to single block.
    3. it will execute when object is created (new Main();) or you will access any static member of class (Main.y=10;).
    4. we cann't use this,super,return keyword in static intializer block.
    
*/
