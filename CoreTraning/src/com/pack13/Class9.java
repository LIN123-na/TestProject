package com.pack13;

public class Class9 {
	protected void meth1() {//overridden
		System.out.println("meth1()called");
		
	}
	void meth2(int x) {
		System.out.println("meth1()called");
	}
	void meth1(int x,String s) {
		System.out.println("meth2()called(int x,String s)");
	}
	static void meth3() {
		System.out.println("meth3()called");
	}
	Class9 meth4() {
		System.out.println("meth4()called");
		return new Class9();
	}

	
	}


