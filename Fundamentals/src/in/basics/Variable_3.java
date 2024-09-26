package in.basics;

public class Variable_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Short a = 156;// -128 127
		int b = a;
		System.out.println(b);
		
		
		//Explicit type casting : data loss
		int x = 145;
		byte y = (byte)x;
		System.out.println(x+" "+y);

	}

}
