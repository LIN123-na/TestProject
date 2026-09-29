package com.pack5;

public class Class7 {
	public String firstHalf(String str) {
		return str.substring(0,str.length()/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class7 aobj=new Class7();
		String result=aobj.firstHalf("HelloThanku");
		System.out.println(result);

	}

}
