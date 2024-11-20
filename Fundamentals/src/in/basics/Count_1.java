package in.basics;

public class Count_1 {
	static int s;
	public Count_1 (int s) {
		System.out.println("OBJ;"+ s);
	}
    
	public void obj() {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Count_1 s1 = new Count_1(s);
		Count_1 s2 = new Count_1(s);
		Count_1 s3 = new Count_1(s);
		Count_1 s4 = new Count_1(s);
		Count_1 s5 = new Count_1(s);
		

	}

}
