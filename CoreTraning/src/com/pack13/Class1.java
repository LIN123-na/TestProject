package com.pack13;
import java.util.Scanner;
public class Class1 {
	Scanner sc=new Scanner(System.in);
	void meth1() {
		System.out.println("meth1()called");
		String names[]= {"Trishika","Sruti","Tanisha","Sweta"};
		System.out.println("Reterving the data by usging for loop");
		for(int i=0;i<=names.length;i++) {
			System.out.println(names[1]+"_");
			
		}
		System.out.println();
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]+"_");
		}
		System.out.println("Reterving the data by using foreach loop");
		
		for(String data:names) {
			System.out.println(data+"_");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 aobj=new Class1();
		aobj.meth1();

	}

}
