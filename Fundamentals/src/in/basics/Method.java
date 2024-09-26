package in.basics;
	
	

public class Method {
	//function definition
	public void m1() {
		System.out.println("Hello");
		m2();
	}
	public void m2() {
		System.out.println("hi");
		m1();
		
	}
	
	public static void main(String[] args) {
	
		new Method().m2();
	   
	

	}

}
