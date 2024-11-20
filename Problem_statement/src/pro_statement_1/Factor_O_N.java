package pro_statement_1;

public class Factor_O_N {
	
	public void factor(int n) {
        System.out.print("the factors of number "+n+ " is 1");
		for (int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.print(","+i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Factor_O_N obj = new Factor_O_N();
		obj.factor(20);
		
	}

}
