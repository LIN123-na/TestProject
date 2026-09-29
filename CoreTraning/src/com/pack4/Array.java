package com.pack4;

import java.util.Arrays;
import java.util.Collections;
public class Array {
	void meth1() {
		//System.out.println("meth1() called");
		String []names= {"anna","maan","gaan","efer","hher"};
		//String[]reverse=new String[original.length];
	//	for(int i=0;i<original.length;i++) {
			//reverse[i]=original[original.length-1-i];
		
		Collections.reverse(Arrays.asList(names));
		System.out.println(Arrays.toString(names));
	
	
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Array aobj=new Array();
     aobj.meth1();
     
	}

}
