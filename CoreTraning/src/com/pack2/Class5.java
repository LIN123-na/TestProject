package com.pack2;

public class Class5 
{
	final static int x;
	static {
		x=50;
		System.out.println("1st static block called:"+x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x=50;
		System.out.println("main()called:"+x);

	}
	static {
		//x=50;
		System.out.println("2nd static block called:"+x);
	}

}
