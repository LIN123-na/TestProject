package com.pack5;

public class Class6 {
	public String firstTwo(String str) {
		if(str.length()>1)
			return str.substring(0,2);
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class6 aobj=new Class6();
		String result=aobj.firstTwo("ab");
		System.out.println(result);

	}

}
