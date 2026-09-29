package com.pack3;

public class Class2 {
	void meth1(int num1,int num2)
	{
		for(;num1<=num2;num1++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(num1+ "*"+i+"=" + (num1*i));
			}
			System.out.println("----------------------");
			
		}
	
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Class2 aobj=new Class2();
         aobj.meth1(2,10);
	}

}
