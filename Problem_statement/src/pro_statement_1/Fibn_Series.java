package pro_statement_1;

public class Fibn_Series {
	
	public void Fib_S(int terms) { 
		 int first = 0, second = 1;
		 System.out.println("The fibonacci series upto "+terms);
		 System.out.print("Fibonacci Series: " + first + ", " + second);
		  for (int i = 2; i < terms; i++) {
	            int next = first + second;
	            System.out.print(", " + next);
	            first = second;
	            second = next;
	        }
	       
	    }

	public static void main(String[] args) {
		 Fibn_Series obj = new  Fibn_Series();
		 obj.Fib_S(20);
		

	}

}
