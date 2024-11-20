package pro_statement_1;

public class Nth_Term {
	
	public void N_t(int terms) {
        System.out.println();
        System.out.println("--------------------------------");  
        
        int first = 0, second = 1;
        
        if (terms == 1) {
            System.out.println("The Fibonacci number at " + terms + "th term is: " + first);
            return;
        } else if (terms == 2) {
            System.out.println("The Fibonacci number at " + terms + "th term is: " + second);
            return;
        }
        
      
        int next = 0;
        for (int i = 3; i <= terms; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println("The Fibonacci number at " + terms + "th term is: " + next);
        System.out.println("--------------------------------");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nth_Term obj =new Nth_Term();
		obj.N_t(10);

	}

}
