package com.pack2;

public class Class4 {
	int x=10;
	static int y=20;
	
	void meth1()
	
	{
		System.out.println("meth1() called");
		System.out.println("Instance variable:"+x);
		System.out.println("Static variable:"+y);
	}
	
	static void meth2()//static method
	{
		System.out.println("meth2() called");
		System.out.println("Instance variable:"+new Class4().x);
		System.out.println("Static variable:"+Class4.y);
		System.out.println("--------------------");
	}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class4 aobj=new Class4();
		aobj.meth1();
		
		meth2();
		aobj.meth2();
		Class4.meth2();
		

	}

}
