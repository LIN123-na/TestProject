package com.pack2;

public class Class3 {
	int x;
	static int y;
	
	Class3()
	{
		x++;
		y++;
		System.out.println("Instance variable x:"+x);
		System.out.println("Static variable y:"+y);//static variable
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Class3();
		new Class3();
		new Class3();
		

	}

}
