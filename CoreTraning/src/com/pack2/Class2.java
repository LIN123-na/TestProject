package com.pack2;

public class Class2 {
	void meth1()
	{
		System.out.println("meth1()called");
		int x=7,y=3;
		boolean isEqual=x==y;
		boolean isGreaterThan=x>y;
		boolean isLessThan=x<y;
		boolean isNotEqual=x!=y;
		
		System.out.println("IsEqual:"+isEqual);
		System.out.println("IsGreaterThan:"+isGreaterThan);
		System.out.println("IsLessThan:"+isLessThan);
		System.out.println("IsNotEqual:"+isNotEqual);
		
		
		
	}
	void meth2()
	{
		System.out.println("meth2()called");
		
		boolean p=true,q=false;
		boolean logicalAnd=p&&q;
		boolean logicalOr=p||q;
		boolean logicalNotp=!p;
		boolean logicalNotq=!q;
		
		System.out.println("LogicalAND:"+logicalAnd);
		System.out.println("LogicalOr:"+logicalOr);
		System.out.println("LogicalNot of p:"+logicalNotp);
		System.out.println("LogicalNot of q:"+logicalNotq);
	
	
}
	void meth3()
	{
		System.out.println("meth3() called");
		int a=10;
		int b=5;
		
		int equalAssignment=a;
		int additionAssignment=a+=b;
		int subtractionAssignment=a-=b;
		int multiplicationAssignment=a*=b;
		int divisionAssignment=a/=b;
		
		System.out.println("equalAssignment:"+equalAssignment);
		System.out.println(" additionAssignment:"+ additionAssignment);
		System.out.println("subtractionAssignment:"+subtractionAssignment);
		System.out.println("multiplicationAssignment:"+multiplicationAssignment);
		System.out.println("divisionAssignment:"+divisionAssignment);
		
		
	}
	void meth4() {
		System.out.println("meth4() called");
		boolean a=true,b=false,c=true,d=false;
		
		boolean flag1=(a&&b)&&(c||d);
		boolean flag2=(a||b)||(c||d);
		boolean flag3=!(a&&b)||!(c||d);
		boolean flag4=a&&(b||(c&&d));
		boolean flag5=(a&&b)||(c&&d);
		
		System.out.println("flag1:"+flag1);
		System.out.println("flag2:"+flag2);
		System.out.println("flag3:"+flag3);
		System.out.println("flag4:"+flag4);
		System.out.println("flag5:"+flag5);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 aobj=new Class2();
		aobj.meth1();
		System.out.println("------------");
		aobj.meth2();
		System.out.println("-------------");
		aobj.meth3();
		System.out.println("--------------");
		aobj.meth4();

	}

}
