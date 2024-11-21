package in.basics;

class num {
	public static void print(int num) {
		if(num==5) return;
		System.out.println(num);
		print(num+1);
		return ;
	}
}

public class Recursion_I {

	public static void main(String[] args) {	
		num.print(-15);
	}
}
