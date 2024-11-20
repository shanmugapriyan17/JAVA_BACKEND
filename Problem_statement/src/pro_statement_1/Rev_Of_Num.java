package pro_statement_1;

public class Rev_Of_Num {
	
	public void R_O_N(int n) {
		int reversed=0;
		System.out.println("the number is "+n);
		while(n!=0) {
			reversed=reversed*10+(n%10);
			n=n/10;
		}
		System.out.println("the reversed number is: "+reversed );
	}

	public static void main(String[] args) {
		Rev_Of_Num obj =new Rev_Of_Num();
		obj.R_O_N(376);
		
	}

}
