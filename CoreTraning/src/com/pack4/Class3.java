package com.pack4;

import java.util.Arrays;

public class Class3 {
	public int[] makeLast(int[] nums)
	{
		int[] result = new int[nums.length * 2];
	    result[result.length - 1] = nums[nums.length - 1];
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class3 aobj=new Class3();
	       int a []= {4,5,6};
	       
	       
	       int result[]=aobj.makeLast(a);
	       System.out.println(Arrays.toString(result));
	       
	}

}
