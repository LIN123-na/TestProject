package comp.pack14;
import java.util.Optional;
public class Class10 {
	void meth1() {
		String arr[]=new String [5];
		arr[1]="Kishan";
		arr[2]="Java";
		Optional<String> o=Optional.ofNullable(arr[2]);
		System.out.println(o);
		if(o.isPresent()) {
			System.out.println("Data is present");
			System.out.println(o.get());
		}
		else {
			System.out.println("Its empty");
			
		}
		System.out.println("-----------");
		for(String data:arr) {
			Optional<String>o2=Optional.ofNullable(data);
			if(o2.isPresent())
				System.out.println(o2.get().toUpperCase());
			else
				System.out.println("In this index position null is present");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Class10().meth1();

	}

}
