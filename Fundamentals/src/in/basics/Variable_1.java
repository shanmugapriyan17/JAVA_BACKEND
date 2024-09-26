package in.basics;

public class Variable_1 {

	int data = 100; //instance variable
	public static void main(String[] args) {
		
		Variable_1 obj = new Variable_1();
		
		Variable_1 obj2 = new Variable_1();
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data= 500;
		
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		
	}

}
