package pro_statement_1;

public class Sum_of_N {
	
	public int S_N(int n) {
			int sum;
			sum=(n*(n+1)/2);
			System.out.println("Sum of n natural numbers is :"+sum);
			return sum;
		}

	public static void main(String[] args) {
		Sum_of_N s1 = new Sum_of_N();
		int n=10;
		s1.S_N(n);
		

	}

}
