package com.pack13;
//Method overloading
public class Class8 {
	public static void meth1() {
		System.out.println(10);
	}
	private int meth1(int i) {
		System.out.println(20);
		return i;
	}
	static protected void meth1(String s) {
		System.out.println(30);
	}
	void meth1(int i,String s) {
		System.out.println(40);
		
	}
	void meth1(String s,int i) {
		System.out.println(60);
	
	}
	byte meth1(byte b) {
		System.out.println(70);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class8 aobj=new Class8();
		aobj.meth1();
		aobj.meth1(100);
		aobj.meth1(101,"Java");
		aobj.meth1("Html",120);
		aobj.meth1((byte)10);
		
		

	}

}
