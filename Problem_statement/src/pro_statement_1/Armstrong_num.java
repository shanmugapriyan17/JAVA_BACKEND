package pro_statement_1;

public class Armstrong_num {
	
	public String F_A(int n) {
		System.out.println("The number is : "+n);
		int orginal=n;
		int sum=0;
		int digits;
		digits=String.valueOf(n).length();
		while(n!=0) {
			sum+=Math.pow((n%10),digits);
			n=n/10;
		}
		if(orginal==sum) {
			return "It is a armstrong number";
		}
		else {
			return "Not a Armstrong number";
		}
		
	}

	public static void main(String[] args) {
		Armstrong_num obj13=new Armstrong_num();
		System.out.println(obj13.F_A(153));
	
		
	}

}
