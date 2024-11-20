package pro_statement_1;

public class Sum_Num_Int {
	 public int S_N_I(int a,int b) {
		 int temp;
		int sum=0;
		if(a>b) {
			temp=b;
			b=a;
			a=temp;
		}
		
		
		for(int i=a;i<=b;i++) {
		sum+=i;
		}
		
		System.out.println("the sum of the given interval is :");
		return sum;
		 
	 }
	public static void main(String[] args) {
		Sum_Num_Int obj = new Sum_Num_Int();
		System.out.println(obj.S_N_I(3, 6));
		

	}

}
