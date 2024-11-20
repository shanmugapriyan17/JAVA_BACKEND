package in.basics;

public class Operators {
	public static void arithmeticOperators() {
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("___________________");
	}
	
	public static void relationalOperators() {
		int x = 20;
		int y = 30;
		
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println("__________________");
		
	}
	
	public static void logicalOperators() {
		int x = 10;
		int y = 20;
		System.out.println((x<y) && (x!=y));
		System.out.println(!((x<y) || (x!=y) && !(x>y)));
		System.out.println("___________________________");
		
	}
	
	public static void ternaryOperator() {
		boolean isLoggedIn = true;
		String result = isLoggedIn? "Hello user" : "please log in";
	    System.out.println(result);
	    System.out.println("___________________");
	}
	
	public static void unaryOperator() {
		int a =10;
		int b = a++;
		System.out.println(a+" "+b);
		
		int x = 12;
		int y = ++x;
		System.out.println(x+" "+y);
		System.out.println("__________________________");
	}
	
	public static void assignmentOperators() {
		int a = 10;
		a += 10; //a = a+10
		System.out.println(a);
		a -= 18; //a = a/18
		System.out.println(a);
		System.out.println("_______________________________");
		
	}

	public static void bitwiseOperators() {
		int a = 10;
		int b = 5;
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println("___________________________"); 
	}
	
	public static void shiftOperators() {
		int num = 10;
		System.out.println(10<<4);
		System.out.println(10>>2);
	}
	
	public static void instanceOfOperators() {
		String str = "Hello";
		int a = 10;
		System.out.println(str instanceof String);
	}
	public static void main(String[] args) {
	   Operators.arithmeticOperators();
	   Operators.relationalOperators();
	   Operators.logicalOperators();
	   Operators.ternaryOperator();
	   Operators.unaryOperator();
	   Operators.assignmentOperators();
	   Operators.bitwiseOperators();
	   Operators.shiftOperators();
	   Operators.instanceOfOperators();
	}
	
}




