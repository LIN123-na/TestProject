package comp.pack14;

public class Class12 {
	String s="Java";
	class InnerClass12{
		void msg1() {
			System.out.println(s.concat("is awesome"));
		}
	}
	class InnerClass13{
		void msg2() {
			System.out.println(s.concat("is amazing"));
		}
		
	
	
	}



	new InnerClass12().msg1();
	new InnerClass13().msg2();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Class12().msg1();

	}


}
}
