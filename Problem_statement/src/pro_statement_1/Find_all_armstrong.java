package pro_statement_1;

public class Find_all_armstrong {

	public boolean I_A(int n) {
		
		int orginal=n;
		int sum=0;
		int digits;
		digits=String.valueOf(n).length();
		while(n!=0) {
			sum+=Math.pow((n%10),digits);
			n=n/10;
		}
		if(orginal==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public void Find_Arm_Num(int a,int b){
		System.out.println("--------------------------------");
		System.out.println("The armstrong number between : "+a+" and "+b);
		int temp;
		if(a>b) {
			temp=b;
			b=a;
			a=temp;
		}
		for(int i=a;i<=b;i++) {
			if(I_A(i)) {
				System.out.print( i+"  ");
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		Find_all_armstrong obj = new Find_all_armstrong();
		obj.I_A(2);
		
		
		
		Find_all_armstrong obj1 = new Find_all_armstrong();
		obj1.Find_Arm_Num(2, 300);
		
		
		
		
		
		

	}

}
