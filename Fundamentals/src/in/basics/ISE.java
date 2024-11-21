package in.basics;

public class ISE {
	
	public static void AB(int n) {
		int[] a = {5,8,3,9,2};
		for (int i=0;i<a.length;i++) {
			System.out.println(i);
			if(a[i]==n) {
				System.out.println("the alemets index is:"+i);
				return;
			}
		}
		System.out.println(-1);
	}
	
	

	public static void main(String[] args) {
		
      ISE.AB(2);
	}

}
