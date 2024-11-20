package pro_statement_1;

public class Palindrom_num {
	
	public int Reverse(int n) {
		int reversed=0;
		System.out.println("the number is "+n);
		while(n!=0) {
			reversed=reversed*10+(n%10);
			n=n/10;
		}
		return reversed;
		
	}
	public String Is_palindrome(int n) {
		if(n==Reverse(n)) {
			return "Palindrome";
		}
		else {
			return "Not a Palindrome";
		}
	}


	public static void main(String[] args) {
		Palindrom_num obj12=new Palindrom_num();
		System.out.println(obj12.Is_palindrome(262));

	}

}
