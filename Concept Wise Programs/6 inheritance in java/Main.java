/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

class Main
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.setRollno(100);
        s1.setName("Rahul");
        s1.setAge(15);

        System.out.println("rollno:"+s1.getRollno());
        System.out.println("name:"+s1.getName());
        System.out.println("age:"+s1.getAge());

    }
    
}