package com.pack2;

public class Class1 {
	void meth1()
	{
		int x=10;
		System.out.println("Before x:"+x);
		x=x++;
		System.out.println("After x:"+x+" \n");
		
		int y=20;
		System.out.println("Before y:"+y);
		int z=y++;
		System.out.println("After y:"+y);
		System.out.println("z value:"+z+"\n");
		
		int i=50;
		System.out.println("Before i:"+i);
		i=i++ + ++i;
		System.out.println("After i:"+i+" \n");
		
		int k=100;
		System.out.println("Before k:"+k);
		k=k++ + 10;
		System.out.println("After k:"+k+" \n");
		
		int m=100;
		System.out.println("Before m:"+m);
		m=++m + 10;
		System.out.println("After m:"+m+" \n");
		System.out.println("sum:"+(x+y+z+i+k+m));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 aobj=new Class1();
		aobj.meth1();

	}

}
