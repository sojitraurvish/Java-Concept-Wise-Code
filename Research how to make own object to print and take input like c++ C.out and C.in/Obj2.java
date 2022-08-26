/**
Author: Urvish Sojitra
Personal Email: sojitraurvish0@gmail.com
Email: 19bmiit036@gmail.com
Institute: Babu Madhav Institute of Information Technology, UTU
 */

//Java code for using 'this' keyword 
//to return the current class instance 
class Obj2 
{ 
	int a; 
	int b; 

	//Default constructor 
	Obj2() 
	{ 
		a = 10; 
		b = 20; 
	} 
	
	//Method that returns current class instance 
	Obj2 get() 
	{ 
		return this; 
	} 
	
	//Displaying value of variables a and b 
	void display() 
	{ 
		System.out.println("a = " + a + " b = " + b); 
	} 

    void display2() 
	{ 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		Obj2 object = new Obj2(); 
		object.get().display2(); 
	} 
} 
