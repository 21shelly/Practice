package Inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		P obj = new P();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		/*
		  Compile time error
		  System.out.println(obj.d2);
		*/
		
		obj.fun();
		obj.fun1();
		/*
		    Compile Time Error
		   obj.fun2();
		*/
		
		//2
		P obj1 = new C();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		
		//typecast

		/*
		  Compile time error
		  System.out.println(obj.d2);
		*/
		obj1.fun();
		obj1.fun1();
		/*
  	     Compile Time Error
	     obj.fun2();
	    */
		
		//3
		/*   Runtime Error
		  WHY CHILD CLASS REFERNCE CANT'T POINTS 
		  TO PARENT CLASS INSTANCE??
		  ->bcz child class is specialized class whose special 
		  properties are not there in parent class,which violates 
		  parent class properties and gives runtime error
		  
		C obj2 = new P();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(obj2.d2);
		obj2.fun();
		obj2.fun1();
		obj2.fun2();
		*/
		
		//4
		C obj3 = new C();
		System.out.println(obj3.d);
		System.out.println(obj3.d1);
		System.out.println(obj3.d2);
		obj3.fun();
		obj3.fun1();
		obj3.fun2();
	}

}
