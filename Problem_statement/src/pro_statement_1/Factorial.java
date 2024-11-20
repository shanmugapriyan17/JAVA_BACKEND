package pro_statement_1;

public class Factorial {
	
	public int Fact_N(int n) {
		
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial=(n*Fact_N(n-1));
		}
		return factorial;
	}

	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		System.out.println(obj.Fact_N(11));
		
		

	}

}
